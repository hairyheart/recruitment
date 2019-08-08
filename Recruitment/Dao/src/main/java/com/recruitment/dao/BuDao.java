package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.BusinessUnit;

@Repository
public class BuDao implements BuDaoInterface {


	private EntityManager entityManager;
	
	@Autowired
	public BuDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}

	
	
	@Override
	public BusinessUnit findBU(String descrizione) {
		Query query=  entityManager.createQuery("from BusinessUnit bu where bu.descrizione= :descrizione");
		query.setParameter("descrizione", descrizione);
		List<BusinessUnit> listBu= query.getResultList();
		return (listBu.isEmpty()?null:listBu.get(0));
	}


	@Override
	public List<BusinessUnit> getAllBu() {
	Query query=  entityManager.createQuery("from BusinessUnit ");
			List<BusinessUnit> list=query.getResultList();
		return list;
	}


	@Override
	public BusinessUnit findBUById(int id) {
		Query  query=  entityManager.createQuery("from BusinessUnit bu where bu.idBusinessUnit= :id");
		query.setParameter("id", id);
		List<BusinessUnit> listBu= query.getResultList();
		return (listBu.isEmpty()?null:listBu.get(0));
	}
	
	
}
