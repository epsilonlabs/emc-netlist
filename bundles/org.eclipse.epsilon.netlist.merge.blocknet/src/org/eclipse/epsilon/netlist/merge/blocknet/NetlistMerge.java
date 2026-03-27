package org.eclipse.epsilon.netlist.merge.blocknet;

import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.netlist.model.blocknet.BlocknetPackage;
import org.eclipse.epsilon.netlist.model.concise.ConcisePackage;
import org.eclipse.epsilon.netlist.model.hash.HashPackage;

public class NetlistMerge implements AutoCloseable {

	public static class Builder {
		private EmfModel netlistModel;
		private EmfModel hashModel;
		private EmfModel targetModel;
		
		public Builder netlist(EmfModel m) {
			this.netlistModel = m;
			return this;
		}

		public Builder netlist(URI modelFileUri) throws EolModelLoadingException {
			this.netlistModel = new EmfModel();
			netlistModel.setName("Concise");
			netlistModel.setMetamodelUri(ConcisePackage.eNS_URI);
			netlistModel.setModelFileUri(modelFileUri);
			netlistModel.setReadOnLoad(true);
			netlistModel.setStoredOnDisposal(false);
			netlistModel.setCachingEnabled(true);
			netlistModel.load();
			return this;
		}

		public Builder hash(EmfModel m) {
			this.hashModel = m;
			return this;
		}

		public Builder hash(URI modelFileUri) throws EolModelLoadingException {
			this.hashModel = new EmfModel();
			hashModel.setName("Hash");
			hashModel.setMetamodelUri(HashPackage.eNS_URI);
			hashModel.setModelFileUri(modelFileUri);
			hashModel.setReadOnLoad(true);
			hashModel.setStoredOnDisposal(false);
			hashModel.setCachingEnabled(true);
			hashModel.load();
			return this;
		}

		public Builder target(EmfModel m) {
			this.targetModel = m;
			return this;
		}

		public Builder target(URI modelFileUri) throws EolModelLoadingException {
			this.targetModel = new EmfModel();
			targetModel.setName("Blocknet");
			targetModel.setMetamodelUri(BlocknetPackage.eNS_URI);
			targetModel.setModelFileUri(modelFileUri);
			targetModel.setReadOnLoad(false);
			targetModel.setStoredOnDisposal(true);
			targetModel.setCachingEnabled(true);
			targetModel.load();
			return this;
		}

		public NetlistMerge build() {
			return new NetlistMerge(netlistModel, hashModel, targetModel);
		}
	}

	private final EmfModel netlistModel;
	private final EmfModel hashModel;
	private final EmfModel targetModel;

	private EclModule eclModule;
	private EmlModule emlModule;

	private NetlistMerge(EmfModel netlist, EmfModel hash, EmfModel target) {
		this.netlistModel = Objects.requireNonNull(netlist);
		this.hashModel = Objects.requireNonNull(hash);
		this.targetModel = Objects.requireNonNull(target);
	}

	public void merge() throws Exception {
		netlistModel.setName("Concise");
		hashModel.setName("Hash");
		targetModel.setName("Blocknet");

		this.eclModule = new EclModule();
		eclModule.getContext().getModelRepository().addModels(netlistModel, hashModel);
		eclModule.parse(getClass().getResource("scripts/blocknet.ecl"));
		eclModule.execute();

		this.emlModule = new EmlModule();
		emlModule.getContext().getModelRepository().addModels(netlistModel, hashModel, targetModel);
		emlModule.getContext().setMatchTrace(eclModule.getContext().getMatchTrace().getReduced());
		emlModule.parse(getClass().getResource("scripts/blocknet.eml"));
		emlModule.execute();
	}

	public EclModule getEclModule() {
		return eclModule;
	}

	public EmlModule getEmlModule() {
		return emlModule;
	}

	@Override
	public void close() throws Exception {
		if (emlModule != null) {
			emlModule.getContext().getModelRepository().dispose();
			emlModule.getContext().dispose();
			eclModule.getContext().dispose();
		} else if (eclModule != null) {
			eclModule.getContext().getModelRepository().dispose();
			eclModule.getContext().dispose();
		}

		emlModule = null;
		eclModule = null;
	}

}
