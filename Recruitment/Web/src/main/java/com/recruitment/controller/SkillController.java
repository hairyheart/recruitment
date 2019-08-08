package com.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.recruitment.dao.entity.BusinessUnit;
import com.recruitment.dao.entity.Skill;
import com.recruitment.service.SkillService;
import com.recruitment.service.SkillServiceInterface;

@Controller
public class SkillController {

	@Autowired
	private SkillServiceInterface skillService;
	

	@RequestMapping(value="/findSkill", method = RequestMethod.GET)
	public String findSkill() {
		return "findSkill";
	}
	
	//se non la trova torna null!
	@RequestMapping(value="/viewSkill")
	public String findSkill(@RequestParam("descrizione") String descrizione, Model model) {
		Skill sk=skillService.findSkill(descrizione);
		model.addAttribute("skill",sk.getDescrizione());
		return "viewSkill";
	}
}
 