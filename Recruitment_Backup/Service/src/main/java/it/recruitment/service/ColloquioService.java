package it.recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.recruitment.dao.ColloquioDaoInterface;
import it.recruitment.dao.entity.Colloquio;

@Service
public class ColloquioService implements ColloquioServiceInterface{
	
	@Autowired
	private ColloquioDaoInterface colloquioDao;
	
	@Transactional
	public void addColloquio(Colloquio c) {
		colloquioDao.addColloquio(c);
	}

	@Transactional
	public List<Colloquio> getAllColloqui() {
		return colloquioDao.findAllColloqui();
	}

}
