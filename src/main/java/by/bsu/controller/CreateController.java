package by.bsu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.bsu.dao.PlaneDao;
import by.bsu.dao.TicketDao;
import by.bsu.model.Ticket;

@Controller
public class CreateController {

	@Autowired
	private TicketDao ticketDao;
	@Autowired 
	private PlaneDao planeDao;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createTicket(@RequestParam("how_long") String how_long, @RequestParam("price") double price,
			@RequestParam("id_class_ticket") int id_class_ticket, ModelAndView mv) {

		Ticket ticket = new Ticket();
		ticket.setHow_long(how_long);
		ticket.setPrice(price);
		ticket.setId_class_ticket(id_class_ticket);

		int counter = ticketDao.create(ticket);

		if (counter > 0) {
			mv.addObject("msg", "Ticket registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("create");

		return mv;
	}
	
	
	
	
	
}