package by.bsu.dao;

import java.util.List;

import by.bsu.model.Ticket;

public interface TicketDao {

	public List<Ticket> listAllTickets();
	public int create(Ticket ticket);
	public int update(Ticket ticket);
	public List<Ticket> read();
	public List<Ticket> findTicketByPrice(double price);
	public int deleteTicket(double price);
}
