package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.EsigenzaDaoInterface;
import it.recruitment.dao.entity.Esigenza;

@Service
public class EsigenzaService implements EsigenzaServiceInterface{
	
	@Autowired
	private EsigenzaDaoInterface esigenzaDao;
	
	@Transactional
	public List<Esigenza> getAllEsigenza(){
		return esigenzaDao.getAllEsigenza();
	}
	
	@Transactional
	public void addEsigenza(Esigenza e) {
		esigenzaDao.addEsigenza(e);
	}

	@Transactional
	public Esigenza findEsigenzaById(int idEsigenza) {
		return esigenzaDao.findEsigenzaById(idEsigenza);
	}
	
	@Transactional
	public void deleteEsigenza(Esigenza e) {
		esigenzaDao.deleteEsigenza(e);
	}

}
