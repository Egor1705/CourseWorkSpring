package by.bsu.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import by.bsu.dao.TicketDao;
import by.bsu.model.Ticket;

@Controller
public class ReadController {

	@Autowired
	private TicketDao ticketDao;

	@RequestMapping(value = "/readTicket")
	public ModelAndView readStudent(ModelAndView model) throws IOException {

		List<Ticket> listTicket = ticketDao.read();
		model.addObject("listTicket", listTicket);
		model.setViewName("read");

		return model;
	}
}