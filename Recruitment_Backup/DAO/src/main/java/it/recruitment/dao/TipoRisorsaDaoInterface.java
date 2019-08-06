package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.TipoRisorsa;

public interface TipoRisorsaDaoInterface {

	public TipoRisorsa findTipoRisorsa(String descrizione);

	public List<TipoRisorsa> getAlltr();

	public TipoRisorsa findTipoRisorsaById(int id);

}
