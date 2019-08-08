package com.recruitment.service;

import java.util.List;

import com.recruitment.dao.entity.Candidato;

public interface CandidatoServiceInterface {

	public Candidato findCandidato(String nome,String cognome);
	public Candidato findCandidato(int id);
	public List<Candidato> getAllCandidato();
	public void deleteCandidato(Candidato c);

}
