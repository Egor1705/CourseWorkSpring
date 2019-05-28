package by.bsu.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.bsu.dao.TicketDao;
import by.bsu.model.Ticket;

@Controller
@RequestMapping(value="/ticket")
public class DeleteController {
	@Autowired
	private TicketDao ticketDao;
	

	
	@RequestMapping(value="/delete/{price}",method = RequestMethod.GET)
	public String delete(@PathVariable("price") double price,Map<String,Object>map) {
		ticketDao.deleteTicket(price);
		return "redirect:/ticket/readTicket";
	}
	
}
