package com.recruitment.service;

import java.util.List;

import com.recruitment.dao.entity.TipoRisorsa;

public interface TipoRisorsaServiceInterface {
	
	public TipoRisorsa findTipoRisorsa(String descrizione);

	public List<TipoRisorsa> getAlltr();
	
	public TipoRisorsa findTipoRisorsaById(int id);

}
