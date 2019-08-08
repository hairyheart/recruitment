package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.Colloquio;

@Repository
public class ColloquioDao implements ColloquioDaoInterface {

	private EntityManager entityManager;
	
	@Autowired
	public ColloquioDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}
	
	@Override
	public void addColloquio(Colloquio c) {
	entityManager.persist(c);
	}

	@Override
	public List<Colloquio> findAllColloqui() {
		Query query= entityManager.createQuery("from Colloquio");
		List<Colloquio> list=query.getResultList();
		return list;
	}
}
