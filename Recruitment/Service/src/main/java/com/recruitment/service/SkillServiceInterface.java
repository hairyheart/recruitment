package com.recruitment.service;

import java.util.List;

import com.recruitment.dao.entity.Skill;

public interface SkillServiceInterface {
	
	public Skill findSkill(String descrizione);

	public List<Skill> getAllSkill();

}
