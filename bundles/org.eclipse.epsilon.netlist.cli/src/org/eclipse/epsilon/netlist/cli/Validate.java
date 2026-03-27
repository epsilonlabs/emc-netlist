package org.eclipse.epsilon.netlist.cli;

import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.epsilon.evl.trace.ConstraintTrace;
import org.eclipse.epsilon.evl.trace.ConstraintTraceItem;
import org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage;
import org.eclipse.epsilon.netlist.model.blocknet.NamedElement;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "validate", mixinStandardHelpOptions = true, description = "Validates the provided .blocknet model against the given constraints")
public class Validate implements Callable<Integer> {

	@Parameters(index = "0", description = "The .blocknet file to be validated")
	private File fBlocknet;

	@Parameters(index = "1", description = "The .evl rules to be checked")
	private File fEvl;

	@Option(names = { "-m", "--model-name" },
			description = "Name of the model in the .evl file",
			defaultValue = "Blocknet")
	private String modelName;

	@Option(names = { "-o", "--only-results" },
			description = "Only show PASSED/FAILED results",
			defaultValue = "false")
	private boolean onlyResults;

	@Override
	public Integer call() throws Exception {
		Setup.setupMetamodels();

		EmfModel mBlocknet = new EmfModel();
		mBlocknet.setName(modelName);
		mBlocknet.setMetamodelUri(BlocknetPackage.eNS_URI);
		mBlocknet.setModelFileUri(EmfUtil.createFileBasedURI(fBlocknet.getCanonicalPath()));
		mBlocknet.setCachingEnabled(true);
		mBlocknet.setReadOnLoad(true);
		mBlocknet.setStoredOnDisposal(false);
		mBlocknet.load();

		EvlModule module = new EvlModule();
		module.getContext().getModelRepository().addModel(mBlocknet);
		try {
			module.parse(fEvl);
			if (!module.getParseProblems().isEmpty()) {
				System.err.println("There were problems during parsing:");
				for (var err : module.getParseProblems()) {
					System.err.println(" - " + err.toString());
				}
				return 1;
			}
			module.execute();

			if (!onlyResults) {
				Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
				for (UnsatisfiedConstraint c : unsatisfied) {
					System.out.println(String.format("%s '%s' unsatisfied for %s: %s",
							c.getConstraint().isCritique() ? "Critique" : "Constraint", c.getConstraint().getName(),
							c.getInstance(), c.getMessage()));
				}
				if (!unsatisfied.isEmpty()) {
					return 2;
				}
			}

			boolean passed = true;
			ConstraintTrace trace = module.getContext().getConstraintTrace();
			for (ConstraintTraceItem item : trace.getItems()) {
				System.out.println(String.format("%s on %s: %s",
					item.getConstraint().getName(),
					getReference((EObject) item.getInstance()),
					item.getResult() ? "PASSED" : "FAILED"));
				passed = passed && item.getResult();
			}
			if (!passed) {
				// We will produce the same status code on a failure,
				// regardless of whether we show the messages or not
				return 2;
			}

			return 0;
		} finally {
			module.getContext().getModelRepository().dispose();
			module.getContext().dispose();
		}
	}

	protected String getReference(EObject eob) {
		if (eob instanceof NamedElement ne) {
			return String.format("%s(%s)", eob.eClass().getName(), ne.getName());
		} else {
			return String.format("%s(%s)", eob.eClass().getName(), EcoreUtil.getURI(eob).toString());
		}
	}

	public static void main(String... args) {
		int exitCode = new CommandLine(new Validate()).execute(args);
		System.exit(exitCode);
	}

}
