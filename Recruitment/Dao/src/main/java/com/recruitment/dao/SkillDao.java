package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.BusinessUnit;
import com.recruitment.dao.entity.Dipendente;
import com.recruitment.dao.entity.Skill;

@Repository
public class SkillDao implements SkillDaoInterface {
	
	private EntityManager entityManager;
	
	@Autowired
	public SkillDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}
	
	@Override
	public Skill findSkill(String descrizione) {
		Query query= entityManager.createQuery("from Skill sk where sk.descrizione=:descrizione");
		query.setParameter("descrizione", descrizione);
		List<Skill> listSkill= query.getResultList();
		return (listSkill.isEmpty()?null:listSkill.get(0));
	}

	@Override
	public List<Skill> getAllSkill() {
		Query query=  entityManager.createQuery("from Skill ");
		List<Skill> list=query.getResultList();
		return list ;
	}
	
	
}
