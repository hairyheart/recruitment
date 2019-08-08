package com.recruitment.dao;

import java.util.List;

import com.recruitment.dao.entity.BusinessUnit;

public interface BuDaoInterface {

	public BusinessUnit findBU(String descrizione);

	public List<BusinessUnit> getAllBu();

	public BusinessUnit findBUById(int id);
}
