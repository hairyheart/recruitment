package it.recruitment.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.Candidato;

@Repository
public class CandidatoDao implements CandidatoDaoInterface{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public Candidato findCandidato(int id) {
		Query<Candidato> query= sessionFactory.getCurrentSession().createQuery("from Candidato c where c.idCandidato= :id");
		query.setParameter("id", id);
		List<Candidato> list=query.list();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override	
	public Candidato findCandidato(String nome,String cognome) {
		Query<Candidato> query= sessionFactory.getCurrentSession().createQuery("from Candidato c where c.nome= :nome and c.cognome= :cognome");
		query.setParameter("nome",nome );
		query.setParameter("cognome", cognome);
		List<Candidato> list=query.list();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override	
	public List<Candidato> getAllCandidato() {
		Query<Candidato> query= sessionFactory.getCurrentSession().createQuery("from Candidato");
		List<Candidato> list=query.list();
		return (list);	
	}
	
	@Override	
	public void deleteCandidato(Candidato c) {
		sessionFactory.getCurrentSession().remove(c);	
	}

}
