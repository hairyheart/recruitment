package com.recruitment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.recruitment.dao.entity.Candidato;

@Repository
public class CandidatoDao implements CandidatoDaoInterface{
	
	private EntityManager entityManager;
	
	@Autowired
	public CandidatoDao(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		}
	
	@Override	
	public Candidato findCandidato(int id) {
		Query query= entityManager.createQuery("from Candidato c where c.idCandidato= :id");
		query.setParameter("id", id);
		List<Candidato> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override	
	public Candidato findCandidato(String nome,String cognome) {
		Query query=entityManager.createQuery("from Candidato c where c.nome= :nome and c.cognome= :cognome");
		query.setParameter("nome",nome );
		query.setParameter("cognome", cognome);
		List<Candidato> list=query.getResultList();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override	
	public List<Candidato> getAllCandidato() {
		Query query=entityManager.createQuery("from Candidato");
		List<Candidato> list=query.getResultList();
		return (list);	
	}
	
	@Override	
	public void deleteCandidato(Candidato c) {
		entityManager.remove(c);	
	}

}
