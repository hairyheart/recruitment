package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.BusinessUnit;

public interface BuDaoInterface {

	public BusinessUnit findBU(String descrizione);

	public List<BusinessUnit> getAllBu();

	public BusinessUnit findBUById(int id);
}
