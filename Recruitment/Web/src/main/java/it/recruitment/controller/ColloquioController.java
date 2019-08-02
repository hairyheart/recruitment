package it.recruitment.controller;

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

import it.recruitment.dao.entity.Candidato;
import it.recruitment.dao.entity.Colloquio;
import it.recruitment.dao.entity.Esigenza;
import it.recruitment.dao.entity.Skill;
import it.recruitment.service.CandidatoServiceInterface;
import it.recruitment.service.ColloquioServiceInterface;
import it.recruitment.service.EsigenzaServiceInterface;

@Controller
public class ColloquioController {

	@Autowired
	private ColloquioServiceInterface colloquioService;

	@Autowired
	private EsigenzaServiceInterface esigenzaService;

	@Autowired
	private CandidatoServiceInterface candidatoService;

	@RequestMapping(value="/gestioneColloquio")
	public String gestioneColloquio(@ModelAttribute ("colloquio") Colloquio colloquio, BindingResult bindingResult, @RequestParam("idEsigenza") int idEsigenza, Model model) {

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


}
