package it.recruitment.service;

import java.util.List;

import it.recruitment.dao.entity.TipoRisorsa;

public interface TipoRisorsaServiceInterface {
	
	public TipoRisorsa findTipoRisorsa(String descrizione);

	public List<TipoRisorsa> getAlltr();
	
	public TipoRisorsa findTipoRisorsaById(int id);

}
