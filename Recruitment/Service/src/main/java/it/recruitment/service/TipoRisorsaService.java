package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.TipoRisorsaDaoInterface;
import it.recruitment.dao.entity.TipoRisorsa;

@Service
public class TipoRisorsaService implements TipoRisorsaServiceInterface{


	@Autowired
	private TipoRisorsaDaoInterface tipoRisorsaDao;
	
	@Transactional
	public TipoRisorsa findTipoRisorsa(String descrizione) {
		return tipoRisorsaDao.findTipoRisorsa(descrizione);
	}

	@Transactional
	public List<TipoRisorsa> getAlltr() {
		return tipoRisorsaDao.getAlltr();
	}
	
	@Transactional
	public TipoRisorsa findTipoRisorsaById(int id) {
		return tipoRisorsaDao.findTipoRisorsaById(id);
	}
}
