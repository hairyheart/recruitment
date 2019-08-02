package it.recruitment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.Utente;


@Repository
public class RecruitmentDao implements RecruitmentDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public Utente find(String username,String password) {
		Query<Utente> query= sessionFactory.getCurrentSession().createQuery("from Utente u where u.username= :username AND u.password= :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<Utente> list=query.list();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override
	public void addUtente(Utente u) {
		sessionFactory.getCurrentSession().save(u);
	}

	@Override
	public void addDipendente(Dipendente d) {
		sessionFactory.getCurrentSession().save(d);
	}
	
	@Override
	public void deleteDipendente(Dipendente d) {
		sessionFactory.getCurrentSession().delete(d);
	}
	
	@Override	
	public Dipendente findDipendente(int id) {
		Query<Dipendente> query= sessionFactory.getCurrentSession().createQuery("from Dipendente d where d.idDipendente= :id");
		query.setParameter("id", id);
		List<Dipendente> list=query.list();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	@Override	
	public List<Dipendente> getAllDipendenti() {
		Query<Dipendente> query= sessionFactory.getCurrentSession().createQuery("from Dipendente ");
		List<Dipendente> list=query.list();
		return list;	
	}
	
	
	@Override	
	public List<Utente> getAllUtenti() {
		Query<Utente> query= sessionFactory.getCurrentSession().createQuery("from Utente ");
		List<Utente> list=query.list();
		return list;	
	}
	
	
	@Override
	public void updateDipendente(Dipendente d) {
		sessionFactory.getCurrentSession().update(d);
	}
	
	@Override
	public Utente findUtenteById(int id) {
		Query<Utente> query= sessionFactory.getCurrentSession().createQuery("from Utente u where u.idUtente= :id");
		query.setParameter("id", id);
		List<Utente> list=query.list();
		return (list.isEmpty()?null:list.get(0));	
	}
	
	
}
