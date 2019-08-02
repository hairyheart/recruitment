package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.BuDaoInterface;
import it.recruitment.dao.entity.BusinessUnit;

@Service
public class BuService  implements BuServiceInterface{

	@Autowired
	private BuDaoInterface buDao;
	
	@Transactional
	public BusinessUnit findBu(String descrizione) {
		return buDao.findBU(descrizione);
	}

	@Transactional
	public List<BusinessUnit> getAllBu() {
		return buDao.getAllBu();
	}
	
	@Transactional
	public BusinessUnit findBuById(int id) {
		return buDao.findBUById(id);
	}
}
