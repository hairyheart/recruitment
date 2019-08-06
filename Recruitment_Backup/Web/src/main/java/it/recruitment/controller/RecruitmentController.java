package it.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.Profilo;
import it.recruitment.dao.entity.Utente;
import it.recruitment.service.RecruitmentService;
import it.recruitment.service.RecruitmentServiceInterface;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@Controller
public class RecruitmentController {

	private static final Logger logger = Logger.getLogger(RecruitmentController.class);

	@Autowired
	private RecruitmentServiceInterface recService;
	
	
	@RequestMapping(value="/login")
	public String myLogin() {
		return "logForm";
	}
	
	
	@RequestMapping(value="/index")
	public String successAuthentication(HttpServletRequest request, HttpServletResponse response, Model model) {
		String username =(String) request.getSession().getAttribute("username");
		List<Profilo> profili=(List<Profilo>) request.getSession().getAttribute("authorities");
		model.addAttribute("username",username);
		model.addAttribute("profilo",profili);
		
		return "index";
	}
	
	@RequestMapping(value="/gestioneDipendenti", method =  RequestMethod.GET)
	public String listaDipendenti(HttpServletRequest request,HttpServletResponse response,Model model) {
		model.addAttribute("allDipendenti", recService.getAllDipendenti());
		return "gestioneDipendenti";
	}
	
		
	@RequestMapping(value="/addDipendente")
	public String addDipendente (@ModelAttribute("dipendente")Dipendente d, BindingResult bindingResult) {
		recService.addDipendente(d);		
		return "redirect:/gestioneDipendenti";
	}
	
	@RequestMapping(value="/deleteDipendente")
	public String deleteDipendente(@RequestParam("idDipendente")int id) {
		Dipendente d=recService.findDipendente(id);
		recService.deleteDipendente(d);
		return "redirect:/gestioneDipendenti";
	}
	
	@RequestMapping(value="/updateDip")
	public String updateDipendente(@RequestParam("idDipendente")int idDipendente,@RequestParam("nomeDipendente")String nomeDipendente,
		  @RequestParam("cognomeDipendente")String cognomeDipendente,@RequestParam("emailDipendente")String emailDipendente,@RequestParam("telefonoDipendente")int telefonoDipendente) {
		
		Dipendente dip=recService.findDipendente(idDipendente);
	   
		dip.setNome(nomeDipendente);
	    dip.setCognome(cognomeDipendente);
	    dip.setEmail(emailDipendente);
	    dip.setNumTelefono(telefonoDipendente);
	      
	    recService.updateDipendente(dip);
		return "redirect:/gestioneDipendenti";
	}
	
	
	@RequestMapping(value="addUtente", method = RequestMethod.GET)
	public String aggiungoUtente(){
		return "addUtente";
	}
	
	@RequestMapping(value="addUtente", method = RequestMethod.POST)
	public String addUtente(@ModelAttribute ("addUtente") Utente u, BindingResult result) {
		String ret;
		if(!(result.hasErrors())) {
			recService.addUtente(u);
			ret="addUtenteResponse";
		}
		else {
			ret="addUtente";
		}
		return ret;
	}
	

	
	
}