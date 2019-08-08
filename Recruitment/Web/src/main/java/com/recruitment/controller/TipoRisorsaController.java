package com.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.recruitment.dao.entity.Skill;
import com.recruitment.dao.entity.TipoRisorsa;
import com.recruitment.service.TipoRisorsaServiceInterface;

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
