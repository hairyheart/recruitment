package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.dao.entity.Skill;

public interface SkillDaoInterface {

	public Skill findSkill(String descrizione);

	public List<Skill> getAllSkill();

}
