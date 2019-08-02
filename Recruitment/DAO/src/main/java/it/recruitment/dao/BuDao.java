package it.recruitment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.BusinessUnit;
import it.recruitment.dao.entity.Dipendente;

@Repository
public class BuDao implements BuDaoInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public BusinessUnit findBU(String descrizione) {
		Query<BusinessUnit> query= sessionFactory.getCurrentSession().createQuery("from BusinessUnit bu where bu.descrizione= : descrizione");
		query.setParameter("descrizione", descrizione);
		List<BusinessUnit> listBu= query.list();
		return (listBu.isEmpty()?null:listBu.get(0));
	}


	@Override
	public List<BusinessUnit> getAllBu() {
	Query<BusinessUnit> query= sessionFactory.getCurrentSession().createQuery("from BusinessUnit ");
			List<BusinessUnit> list=query.list();
		return list;
	}


	@Override
	public BusinessUnit findBUById(int id) {
		Query<BusinessUnit> query= sessionFactory.getCurrentSession().createQuery("from BusinessUnit bu where bu.idBusinessUnit= : id");
		query.setParameter("id", id);
		List<BusinessUnit> listBu= query.list();
		return (listBu.isEmpty()?null:listBu.get(0));
	}
	
	
}
