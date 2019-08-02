package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.Candidato;

public interface CandidatoDaoInterface {

	public Candidato findCandidato(int id);

	public Candidato findCandidato(String nome, String cognome);

	public List<Candidato> getAllCandidato();

	public void deleteCandidato(Candidato c);
	

}
