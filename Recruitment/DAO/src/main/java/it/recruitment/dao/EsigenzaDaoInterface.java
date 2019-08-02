package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.Esigenza;

public interface EsigenzaDaoInterface {
	public void addEsigenza(Esigenza esigenza);
	public List<Esigenza> getAllEsigenza();
	public Esigenza findEsigenzaById(int idEsigenza);
	public void deleteEsigenza(Esigenza e);
}
