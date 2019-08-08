package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.Dipendente;
import com.recruitment.dao.entity.Utente;


@Repository
public class RecruitmentDao implements RecruitmentDaoInterface {
	
	private EntityManager entityManager;
	
	@Autowired
	public RecruitmentDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}
	
	@Override	
	public Utente find(String username,String password) {
		Query query=entityManager.createQuery("from Utente u where u.username= :username AND u.password= :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<Utente> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override
	public void addUtente(Utente u) {
		entityManager.persist(u);
		entityManager.flush();
	}

	@Override
	public void addDipendente(Dipendente d) {
		entityManager.persist(d);
		entityManager.flush();
	}
	
	@Override
	public void deleteDipendente(Dipendente d) {
		entityManager.remove(d);
	}
	
	@Override	
	public Dipendente findDipendente(int id) {
		Query query=  entityManager.createQuery("from Dipendente d where d.idDipendente=:id");
		query.setParameter("id", id);
		List<Dipendente> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));	
	}
	

	@Override	
	public List<Dipendente> getAllDipendenti() {
		Query query=entityManager.createQuery("from Dipendente ");
		List<Dipendente> list= query.getResultList();
		return list;	
	}
	
	
	@Override	
	public List<Utente> getAllUtenti() {
		Query query=  entityManager.createQuery("from Utente ");
		List<Utente> list=query.getResultList();
		return list;	
	}
	
	
	@Override
	public void updateDipendente(Dipendente d) {
		entityManager.merge(d);
	}
	
	@Override
	public Utente findUtenteById(int id) {
		Query query=  entityManager.createQuery("from Utente u where u.idUtente=:id");
		query.setParameter("id", id);
		List<Utente> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	
}
