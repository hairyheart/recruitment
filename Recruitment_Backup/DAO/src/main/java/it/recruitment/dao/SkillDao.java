package it.recruitment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.Skill;

@Repository
public class SkillDao implements SkillDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Skill findSkill(String descrizione) {
		Query<Skill> query= sessionFactory.getCurrentSession().createQuery("from Skill sk where sk.descrizione= : descrizione");
		query.setParameter("descrizione", descrizione);
		List<Skill> listSkill= query.list();
		return (listSkill.isEmpty()?null:listSkill.get(0));
	}

	@Override
	public List<Skill> getAllSkill() {
		Query<Skill> query= sessionFactory.getCurrentSession().createQuery("from Skill ");
		List<Skill> list=query.list();
		return list ;
	}
	
	
}
