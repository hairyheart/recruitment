package com.recruitment.dao;

import java.util.List;

import com.recruitment.dao.entity.BusinessUnit;
import com.recruitment.dao.entity.Skill;

public interface SkillDaoInterface {

	public Skill findSkill(String descrizione);

	public List<Skill> getAllSkill();

}
