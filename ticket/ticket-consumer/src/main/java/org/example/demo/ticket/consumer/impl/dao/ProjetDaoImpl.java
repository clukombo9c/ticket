package org.example.demo.ticket.consumer.impl.dao;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

@ManagedBean
public class ProjetDaoImpl implements ProjetDao {
	
    @Inject
    private TicketDao ticketDao;

    @Inject
    private UtilisateurDao utilisateurDao;

    // ...
}

