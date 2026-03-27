package org.eclipse.epsilon.netlist.cli;

import java.io.File;
import java.util.concurrent.Callable;

import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.netlist.merge.blocknet.NetlistMerge;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "merge", mixinStandardHelpOptions = true, description = "Merges a .dat and a .hash file into a .blocknet file")
public class Merge implements Callable<Integer> {

	@Parameters(index = "0", description="The .dat file with the concise netlist to be read")
	private File fDat;

	@Parameters(index = "1", description="The .hash file with the circuit blocks to be read")
	private File fHash;

	@Parameters(index = "2", description="The .blocknet file to be written with the merge result")
	private File fBlocknet;

	@Override
	public Integer call() throws Exception {
		Setup.setupMetamodels();
		
		var builder = new NetlistMerge.Builder()
			.netlist(EmfUtil.createFileBasedURI(fDat.getCanonicalPath()))
			.hash(EmfUtil.createFileBasedURI(fHash.getCanonicalPath()))
			.target(EmfUtil.createFileBasedURI(fBlocknet.getCanonicalPath()));

		try (var merge = builder.build()) {
			merge.merge();
		}

		return 0;
	}

	public static void main(String... args) {
		int exitCode = new CommandLine(new Merge()).execute(args);
		System.exit(exitCode);
	}
}
