package com.recruitment.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.recruitment.dao.entity.Esigenza;

@Repository
public class EsigenzaDao implements EsigenzaDaoInterface {
	
	private EntityManager entityManager;
	
	@Autowired
	public EsigenzaDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}

	@Override
	public void addEsigenza(Esigenza esigenza) {
       entityManager.persist(esigenza);
	}
	
	@Override
	public List<Esigenza> getAllEsigenza() {
		Query  query= entityManager.createQuery("from Esigenza");
		List<Esigenza> list=query.getResultList();
		return list;
	}

	@Override
	public Esigenza findEsigenzaById(int idEsigenza) {
		Query query=entityManager.createQuery("from Esigenza e where e.idEsigenza= :idEsigenza");
		query.setParameter("idEsigenza", idEsigenza);
		List<Esigenza> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));
	}
	
	@Override
	public void deleteEsigenza(Esigenza e) {
		entityManager.remove(e);		
	}
	

}
