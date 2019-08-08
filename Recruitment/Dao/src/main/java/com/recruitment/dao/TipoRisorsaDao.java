package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.TipoRisorsa;

@Repository
public class TipoRisorsaDao implements TipoRisorsaDaoInterface{
	
	private EntityManager entityManager;
	
	@Autowired
	public TipoRisorsaDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}
	
	@Override
	public TipoRisorsa findTipoRisorsa(String descrizione) {
		Query query= entityManager.createQuery("from TipoRisorsa tr where tr.descrizione=:descrizione");
		query.setParameter("descrizione", descrizione);
		List<TipoRisorsa> listTr= query.getResultList();
		return (listTr.isEmpty()?null:listTr.get(0));
	}

	@Override
	public List<TipoRisorsa> getAlltr() {
		Query query=  entityManager.createQuery("from TipoRisorsa ");
		List<TipoRisorsa> list=query.getResultList();
		return list;
	}

	@Override
	public TipoRisorsa findTipoRisorsaById(int id) {
		Query query= entityManager.createQuery("from TipoRisorsa tr where tr.idRisorsa=:id");
		query.setParameter("id", id);
		List<TipoRisorsa> listTr= query.getResultList();
		return (listTr.isEmpty()?null:listTr.get(0));
	}
}
