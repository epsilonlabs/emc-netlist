package org.eclipse.epsilon.netlist.model.conciseNetlist.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class ConciseNetlistResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new ConciseNetlistResource(uri);
	}

}
