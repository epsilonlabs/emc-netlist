package org.eclipse.epsilon.netlist.merge.dt;

import java.io.File;
import java.util.Objects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.netlist.merge.blocknet.NetlistMerge;
import org.eclipse.epsilon.netlist.merge.blocknet.NetlistMerge.Builder;

public class MergeJob extends Job {

	private final IFile netlistModel;
	private final IFile hashModel;
	private final File targetModel;

	public MergeJob(IFile netlistModel, IFile hashModel, File targetModel) {
		super("Merge Netlist with Hash");
		this.netlistModel = Objects.requireNonNull(netlistModel);
		this.hashModel = Objects.requireNonNull(hashModel);
		this.targetModel = Objects.requireNonNull(targetModel);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			URI netlistUri = EmfUtil.createUri(netlistModel.getLocationURI().toString());
			URI hashUri = EmfUtil.createUri(hashModel.getLocationURI().toString());
			URI targetUri = EmfUtil.createFileBasedURI(targetModel.getCanonicalPath());

			Builder builder = new NetlistMerge.Builder()
				.netlist(netlistUri)
				.hash(hashUri)
				.target(targetUri);

			try (NetlistMerge merge = builder.build()) {
				merge.merge();
			}
		} catch (Exception ex) {
			return Status.error("Merge failed", ex);
		}

		return Status.OK_STATUS;
	}

}
