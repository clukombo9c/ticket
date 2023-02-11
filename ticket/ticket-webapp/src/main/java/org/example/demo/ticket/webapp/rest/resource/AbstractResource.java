package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.ManagerFactory;

public abstract class AbstractResource {

	public static ManagerFactory managerFactory;
	
	protected static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractResource.managerFactory = managerFactory;
	}
	
}
