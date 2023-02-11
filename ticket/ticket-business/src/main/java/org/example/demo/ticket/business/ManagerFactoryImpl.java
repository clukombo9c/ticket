package org.example.demo.ticket.business;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {
	
	@Inject
	private ProjetManager projetManager;
	
	@Inject
	private TicketManager ticketManager;

	@Override
	public ProjetManager getProjetManager() {
		return projetManager;
	}

	@Override
	public void setProjetManager(ProjetManager projectManager) {
		this.projetManager = projectManager;
	}

	@Override
	public TicketManager getTicketManager() {
		return ticketManager;
	}

	@Override
	public void setTicketManager(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}
}
