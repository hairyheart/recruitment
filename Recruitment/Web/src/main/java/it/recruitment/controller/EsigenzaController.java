package it.recruitment.controller;

import java.util.HashSet;
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

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.Esigenza;
import it.recruitment.dao.entity.Skill;
import it.recruitment.dao.entity.TipoRisorsa;
import it.recruitment.dao.entity.Utente;
import it.recruitment.service.BuServiceInterface;
import it.recruitment.service.EsigenzaServiceInterface;
import it.recruitment.service.RecruitmentServiceInterface;
import it.recruitment.service.SkillServiceInterface;
import it.recruitment.service.TipoRisorsaServiceInterface;

@Controller
public class EsigenzaController {
	
	@Autowired
	private EsigenzaServiceInterface esigenzaService;
	
	@Autowired
	private BuServiceInterface buService;
	
	@Autowired
	private TipoRisorsaServiceInterface trService;
	
	@Autowired
	private RecruitmentServiceInterface recService;
	
	@Autowired
	private SkillServiceInterface skillService;
	
	@RequestMapping(value="/addEsigenza")
		public String addEsigenza(@ModelAttribute("esigenza")Esigenza e, BindingResult bindingresult, @RequestParam("skill") int[] skill,@RequestParam("tipoRisorsa")int tipoRisorsa,
				@RequestParam("businessUnit")int businessUnit,@RequestParam("utente")int utente){
		Set<Skill> skills = new HashSet<Skill>();
		for(int id : skill) {
			skills.add(new Skill(id));
		}
		e.setSkills(skills);
		e.setUtente(recService.findUtenteById(utente));
		e.setBusinessUnit(buService.findBuById(businessUnit));
		e.setTipoRisorsa(trService.findTipoRisorsaById(tipoRisorsa));

		esigenzaService.addEsigenza(e);
		return "redirect:/listaEsigenza";
	}
	
	@RequestMapping(value="/listaEsigenza")
	public String listaEsigenza(@ModelAttribute("esigenza")Esigenza e, BindingResult bindingresult, Model model){
		List<Esigenza> listaEsigenza=esigenzaService.getAllEsigenza();
		//System.out.println(listaEsigenza.get(0).getSkills().toString());
		model.addAttribute("listaEsigenza", listaEsigenza);
		
		List<String> listaTipo= new LinkedList<String>();
		listaTipo.add("Esterno");
		listaTipo.add("Interno");
		
		List<Utente> listaUser=recService.getAllUtenti();
		List<BusinessUnit> listaBU=buService.getAllBu();
		List<TipoRisorsa> listaTR=trService.getAlltr();
		List<Skill> listaSK=skillService.getAllSkill();
		
		model.addAttribute("listaTipo",listaTipo);
        model.addAttribute("listaSK", listaSK);
 		model.addAttribute("listaUser",listaUser);
		model.addAttribute("listaBU", listaBU);
 		model.addAttribute("listaTR", listaTR);

	return "listaEsigenza";
  }
	@RequestMapping(value="/deleteEsigenza")
	public String deleteEsigenza(@RequestParam("idEsigenza")int idEsigenza) {
		Esigenza esigenza=esigenzaService.findEsigenzaById(idEsigenza);
		esigenzaService.deleteEsigenza(esigenza);
		return "redirect:/listaEsigenza";
	}
	
	

}
