package com.recruitment.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.recruitment.dao.entity.Candidato;
import com.recruitment.dao.entity.Colloquio;
import com.recruitment.dao.entity.Esigenza;
import com.recruitment.dao.entity.Skill;
import com.recruitment.service.CandidatoServiceInterface;
import com.recruitment.service.ColloquioServiceInterface;
import com.recruitment.service.EsigenzaServiceInterface;

@Controller
public class ColloquioController {

	@Autowired
	private ColloquioServiceInterface colloquioService;

	@Autowired
	private EsigenzaServiceInterface esigenzaService;

	@Autowired
	private CandidatoServiceInterface candidatoService;

	@RequestMapping(value="/gestioneColloquio")
	public String gestioneColloquio(@ModelAttribute ("colloquio") Colloquio colloquio, BindingResult bindingResult,
			@RequestParam("idEsigenza") int idEsigenza, Model model) {

		Esigenza e = esigenzaService.findEsigenzaById(idEsigenza);		

		Set<Skill> skills = e.getSkills();
        List<String> listaStringEsigenza=new LinkedList<String>();
        
		List<Candidato>candidati = candidatoService.getAllCandidato();
        
		List<Candidato>cadidatiSelezionati = new ArrayList<Candidato>();
	
		for(Skill s:skills) {
			listaStringEsigenza.add(s.getDescrizione());			
		}
		
		List<String> listaStringCandidato= new LinkedList<>();
		
		for(Candidato c:candidati){
			
	      listaStringCandidato.clear();
 
			for(Skill s: c.getSkills()) {
				
				listaStringCandidato.add(s.getDescrizione());
		}
			
		 if(listaStringCandidato.containsAll(listaStringEsigenza)) {
				cadidatiSelezionati.add(c);
		}
		 								
	}
		model.addAttribute("candidati", cadidatiSelezionati);
		model.addAttribute("idEsigenza",idEsigenza);
		return "creaColloquio";
	
}
	
	
	@RequestMapping(value="/addColloquio")
	public String creaColloquio(@ModelAttribute("colloquio") Colloquio colloquio, BindingResult bindingResult, 
			@RequestParam("candidato")int idCandidato, @RequestParam("esigenza")int idEsigenza) {
		
		Esigenza e=esigenzaService.findEsigenzaById(idEsigenza);
		Candidato c=candidatoService.findCandidato(idCandidato);
		colloquio.setCandidato(c);
		colloquio.setEsigenza(e);
		
		colloquioService.addColloquio(colloquio);
		
		return "redirect:/listaEsigenza";
	}
	
	@RequestMapping(value="/listaColloqui")
	public String listaColloqui(@ModelAttribute("colloqui")Colloquio c, BindingResult bindingresult, Model model){
		
		
		List<Colloquio> colloquio= colloquioService.getAllColloqui();
		
		for(Colloquio cc: colloquio) {
		System.out.println(cc.getEsigenza().getUtente().getDipendente().getCognome());
		}
		model.addAttribute("colloquio", colloquio);
		
		return "listaColloqui";
	}
	
}



