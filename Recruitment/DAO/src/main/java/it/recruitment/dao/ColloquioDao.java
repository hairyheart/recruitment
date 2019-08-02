package it.recruitment.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.Colloquio;

@Repository
public class ColloquioDao implements ColloquioDaoInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addColloquio(Colloquio c) {
		sessionFactory.getCurrentSession().save(c);	
	}
}
