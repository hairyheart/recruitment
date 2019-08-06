package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.RecruitmentDao;
import it.recruitment.dao.RecruitmentDaoInterface;
import it.recruitment.dao.entity.Dipendente;
import it.recruitment.dao.entity.Utente;

@Service
public class RecruitmentService implements RecruitmentServiceInterface{
	
	@Autowired
	private RecruitmentDaoInterface recDao;
	
	@Transactional
	public Utente find(String username,String password) {
		return recDao.find(username, password);
	}
	
	@Transactional
	public void addUtente(Utente u) {
		recDao.addUtente(u);
	}

	@Transactional
	public void addDipendente(Dipendente d) {
		recDao.addDipendente(d);
	}
	
	@Transactional
	public void deleteDipendente(Dipendente d) {
		recDao.deleteDipendente(d);
	}
	
	@Transactional
	public Dipendente findDipendente(int id) {
		return recDao.findDipendente(id);
	}
	
	@Transactional
	public List<Dipendente> getAllDipendenti(){
		return recDao.getAllDipendenti();
	}
	
	@Transactional
	public void updateDipendente(Dipendente d) {
		recDao.updateDipendente(d);
	}
	
	@Transactional
	public List<Utente> getAllUtenti(){
		return recDao.getAllUtenti();
	}
	
	@Transactional
	public Utente findUtenteById(int id) {
		return recDao.findUtenteById(id);
	}
}


