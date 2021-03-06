package com.recruitment.service;

import java.util.List;

import com.recruitment.dao.entity.Dipendente;
import com.recruitment.dao.entity.Utente;

public interface RecruitmentServiceInterface {
	
	public Utente find(String username,String password);
	public void addUtente(Utente u);
	public void addDipendente(Dipendente d);
	public void deleteDipendente(Dipendente d);
	public Dipendente findDipendente(int id);
	public List<Dipendente> getAllDipendenti();
	public void updateDipendente(Dipendente d);
	public List<Utente> getAllUtenti();
	public Utente findUtenteById(int id);

}
