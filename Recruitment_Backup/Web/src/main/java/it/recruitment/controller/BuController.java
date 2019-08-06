package it.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.service.BuServiceInterface;

@Controller
public class BuController {
	
	@Autowired
	private BuServiceInterface buService;

	@RequestMapping(value="/findBu", method = RequestMethod.GET)
	public String findBu() {
		return "findBu";
	}
	
	//se non la trova torna null!
	@RequestMapping(value="/viewBu")
	public String findBu(@RequestParam("descrizione") String descrizione, Model model) {
		BusinessUnit bu=buService.findBu(descrizione);
		model.addAttribute("businessUnit",bu.getDescrizione());
		return "viewBu";
	}
	
	
	
	
}
