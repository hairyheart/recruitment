package it.recruitment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.Candidato;
import it.recruitment.dao.entity.Colloquio;

@Repository
public class ColloquioDao implements ColloquioDaoInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addColloquio(Colloquio c) {
		sessionFactory.getCurrentSession().save(c);	
	}

	@Override
	public List<Colloquio> findAllColloqui() {
		Query<Colloquio> query= sessionFactory.getCurrentSession().createQuery("from Colloquio");
		List<Colloquio> list=query.list();
		return list;
	}
}
