package it.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.userapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService us;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(Model model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
//		us.findAll();
		return "index";
	}
}
