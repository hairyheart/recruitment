package it.recruitment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.TipoRisorsa;

@Repository
public class TipoRisorsaDao implements TipoRisorsaDaoInterface{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public TipoRisorsa findTipoRisorsa(String descrizione) {
		Query<TipoRisorsa> query= sessionFactory.getCurrentSession().createQuery("from TipoRisorsa tr where tr.descrizione= : descrizione");
		query.setParameter("descrizione", descrizione);
		List<TipoRisorsa> listTr= query.list();
		return (listTr.isEmpty()?null:listTr.get(0));
	}

	@Override
	public List<TipoRisorsa> getAlltr() {
		Query<TipoRisorsa> query= sessionFactory.getCurrentSession().createQuery("from TipoRisorsa ");
		List<TipoRisorsa> list=query.list();
		return list;
	}

	@Override
	public TipoRisorsa findTipoRisorsaById(int id) {
		Query<TipoRisorsa> query= sessionFactory.getCurrentSession().createQuery("from TipoRisorsa tr where tr.idRisorsa= : id");
		query.setParameter("id", id);
		List<TipoRisorsa> listTr= query.list();
		return (listTr.isEmpty()?null:listTr.get(0));
	}
}
