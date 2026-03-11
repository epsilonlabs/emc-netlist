package org.eclipse.epsilon.netlist.model.hash.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class HashResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new HashResource(uri);
	}

}
