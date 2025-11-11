package org.eclipse.epsilon.emc.netlist;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolEnumerationValueNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.netlist.model.conciseNetlist.ConciseNetlistPackage;
import org.eclipse.epsilon.netlist.model.conciseNetlist.resource.ConciseNetlistResourceFactory;

public class ConciseNetlistModel extends Model {

	private InMemoryEmfModel model;
	private URI modelFileUri;

	@Override
	public void load() throws EolModelLoadingException {
		if (modelFileUri == null) {
			throw new IllegalStateException("Model file URI has not been set");
		}

		ResourceSet rs = new ResourceSetImpl();

		Map<String, Object> extMap = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extMap.put("dat", new ConciseNetlistResourceFactory());

		Registry registry = rs.getPackageRegistry();
		registry.put(ConciseNetlistPackage.eNS_URI, ConciseNetlistPackage.eINSTANCE);
		
		Resource r = rs.getResource(modelFileUri, true);
		model = new InMemoryEmfModel(r);
	}

	public URI getModelFileUri() {
		return modelFileUri;
	}

	public void setModelFileUri(URI modelFileUri) {
		this.modelFileUri = modelFileUri;
	}

	public void setModelFile(File file) {
		this.modelFileUri = URI.createFileURI(file.getAbsolutePath());
	}

	public void setModelFile(String path) {
		setModelFile(new File(path));
	}

	@Override
	public Object getEnumerationValue(String enumeration, String label) throws EolEnumerationValueNotFoundException {
		return model.getEnumerationValue(enumeration, label);
	}

	@Override
	public Collection<?> allContents() {
		return model.allContents();
	}

	@Override
	public Collection<?> getAllOfType(String type) throws EolModelElementTypeNotFoundException {
		return model.getAllOfType(type);
	}

	@Override
	public Collection<?> getAllOfKind(String kind) throws EolModelElementTypeNotFoundException {
		return model.getAllOfKind(kind);
	}

	@Override
	public String getTypeNameOf(Object instance) {
		return model.getTypeNameOf(instance);
	}

	@Override
	public Object createInstance(String type)
			throws EolModelElementTypeNotFoundException, EolNotInstantiableModelElementTypeException {
		return model.createInstance(type);
	}

	@Override
	public Object getElementById(String id) {
		return model.getElementById(id);
	}

	@Override
	public String getElementId(Object instance) {
		return model.getElementId(instance);
	}

	@Override
	public void setElementId(Object instance, String newId) {
		model.setElementId(instance, newId);
	}

	@Override
	public void deleteElement(Object instance) throws EolRuntimeException {
		model.deleteElement(instance);
	}

	@Override
	public boolean owns(Object instance) {
		return model.owns(instance);
	}

	@Override
	public boolean isInstantiable(String type) {
		return model.isInstantiable(type);
	}

	@Override
	public boolean hasType(String type) {
		return model.hasType(type);
	}

	@Override
	public boolean store(String location) {
		return model.store(location);
	}

	@Override
	public boolean store() {
		return model.store();
	}

	@Override
	public void dispose() {
		super.dispose();
		model = null;
	}
}
