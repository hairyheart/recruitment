package it.recruitment.service;

import java.util.List;

import it.recruitment.dao.entity.Esigenza;

public interface EsigenzaServiceInterface {

	public List<Esigenza> getAllEsigenza();
	public void addEsigenza(Esigenza e);
	public Esigenza findEsigenzaById(int idEsigenza);
	public void deleteEsigenza(Esigenza e);
}
