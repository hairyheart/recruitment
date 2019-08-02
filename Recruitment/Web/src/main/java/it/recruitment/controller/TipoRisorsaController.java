package it.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.recruitment.dao.entity.Skill;
import it.recruitment.dao.entity.TipoRisorsa;
import it.recruitment.service.TipoRisorsaServiceInterface;

@Controller
public class TipoRisorsaController {
	
	@Autowired
	private TipoRisorsaServiceInterface tipoRisorsaService;
	
	@RequestMapping(value="/findTipoRisorsa", method = RequestMethod.GET)
	public String findTipoRisorsa() {
		return "findTipoRisorsa";
	}
	
	//se non la trova torna null!
	@RequestMapping(value="/viewTipoRisorsa")
	public String viewTipoRisorsa(@RequestParam("descrizione") String descrizione, Model model) {
		TipoRisorsa tr=tipoRisorsaService.findTipoRisorsa(descrizione);
		model.addAttribute("tipoRisorsa",tr.getDescrizione());
		return "viewTipoRisorsa";
	}

}
