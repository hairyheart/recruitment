package com.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recruitment.dao.BuDaoInterface;
import com.recruitment.dao.CandidatoDaoInterface;
import com.recruitment.dao.entity.BusinessUnit;
import com.recruitment.dao.entity.Candidato;


@Service
public class CandidatoService implements CandidatoServiceInterface {

	
	@Autowired
	private CandidatoDaoInterface candidatoDao;
	
	@Transactional
	public Candidato findCandidato(String nome,String cognome) {
		return candidatoDao.findCandidato(nome,cognome);
	}
	
	@Transactional
	public Candidato findCandidato(int id) {
		return candidatoDao.findCandidato(id);
	}
	
	@Transactional
	public List<Candidato> getAllCandidato() {
		return candidatoDao.getAllCandidato();
	}
	
	@Transactional
	public void deleteCandidato(Candidato c) {
		candidatoDao.deleteCandidato(c);
	}
	
	
}
