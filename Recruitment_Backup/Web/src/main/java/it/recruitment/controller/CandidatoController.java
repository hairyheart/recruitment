package it.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.dao.entity.Candidato;
import it.recruitment.service.CandidatoServiceInterface;

@Controller
public class CandidatoController {
	
	@Autowired
	private CandidatoServiceInterface candidatoService;
	
	@RequestMapping(value="/gestioneCandidati")
	public String gestioneCandidato(Model model) {
		List<Candidato> c=candidatoService.getAllCandidato();
		model.addAttribute("allCandidati",c);
		return "gestioneCandidati";
	}
	
	@RequestMapping(value="/deleteCandidato")
	public String deleteCandidato(@RequestParam("idCandidato")int id) {
		Candidato c=candidatoService.findCandidato(id);
		candidatoService.deleteCandidato(c);
		return "redirect:/gestioneCandidati";
	}
	

}
