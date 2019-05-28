package by.bsu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import by.bsu.model.Ticket;

public class TicketDaoImpl implements TicketDao {

	private JdbcTemplate jdbcTemp;
	
	
	
	
	
	public TicketDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}


	
	public List<Ticket> listAllTickets() {
		
		List<Ticket> list = jdbcTemp.query("SELECT * FROM TICKETS", new RowMapper<Ticket>() {

			public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket ticket = new Ticket();

				ticket.setId(rs.getInt("id_ticket"));
				ticket.setPrice(rs.getDouble("price"));
				ticket.setHow_long(rs.getString("how_long"));
				ticket.setId_class_ticket(rs.getInt("id_class_ticket"));
				
				return ticket;
			}
				
		});	
		return list;
	}


	@Override
	public int create(Ticket ticket) {
		String sql = "insert into Tickets(how_long,price,id_class_ticket) values(?,?,?)";

		try {

			int counter = jdbcTemp.update(sql,
					new Object[] { ticket.getHow_long(), ticket.getPrice(), ticket.getId_class_ticket() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	

	
	

	@Override
	public int update(Ticket ticket) {
		String sql = "update Tickets set how_long=?, id_class_ticket=? where price=?";

		try {

			int counter = jdbcTemp.update(sql,
					new Object[] { ticket.getHow_long(), ticket.getPrice(), ticket.getId_class_ticket() });
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}


	@Override
	public List<Ticket> read() {
		List<Ticket> ticketList = jdbcTemp.query("SELECT * FROM Tickets", new RowMapper<Ticket>() {

			@Override
			public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket ticket = new Ticket();

				ticket.setId(rs.getInt("id_ticket"));
				ticket.setPrice(rs.getDouble("price"));
				ticket.setHow_long(rs.getString("how_long"));
				ticket.setId_class_ticket(rs.getInt("id_class_ticket"));
				
				return ticket;
			}

		});

		return ticketList;
	}

	@Override
	public List<Ticket> findTicketByPrice(double price) {
		List<Ticket> ticketList = jdbcTemp.query("SELECT * FROM TICKETS where price=?",
				new Object[] { price }, new RowMapper<Ticket>() {

					@Override
					public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
						Ticket ticket = new Ticket();

						ticket.setId(rs.getInt("id_ticket"));
						ticket.setPrice(rs.getDouble("price"));
						ticket.setHow_long(rs.getString("how_long"));
						ticket.setId_class_ticket(rs.getInt("id_class_ticket"));
						
						return ticket;
					}

				});

		return ticketList;
	}




	@Override
	public int deleteTicket(double price) {
		String sql = "delete from Tickets where price=?";

		Ticket ticket = new Ticket();
		try {

			int counter = jdbcTemp.update(sql, new Object[] { ticket.getPrice()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	
	

}
