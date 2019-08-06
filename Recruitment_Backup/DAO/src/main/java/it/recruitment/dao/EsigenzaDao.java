package it.recruitment.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import it.recruitment.dao.entity.Esigenza;

@Repository
public class EsigenzaDao implements EsigenzaDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addEsigenza(Esigenza esigenza) {
       sessionFactory.getCurrentSession().save(esigenza);
	}
	
	@Override
	public List<Esigenza> getAllEsigenza() {
		Query<Esigenza> query=sessionFactory.getCurrentSession().createQuery("from Esigenza");
		List<Esigenza> list=query.list();
		return list;
	}

	@Override
	public Esigenza findEsigenzaById(int idEsigenza) {
		Query<Esigenza> query=sessionFactory.getCurrentSession().createQuery("from Esigenza e where e.idEsigenza= : idEsigenza");
		query.setParameter("idEsigenza", idEsigenza);
		List<Esigenza> list=query.list();
		return (list.isEmpty()?null:list.get(0));
	}
	
	@Override
	public void deleteEsigenza(Esigenza e) {
		sessionFactory.getCurrentSession().remove(e);		
	}
	

}
