package it.recruitment.service;

import java.util.List;

import it.recruitment.dao.entity.BusinessUnit;

public interface BuServiceInterface {

	public BusinessUnit findBu(String descrizione);

	public List<BusinessUnit> getAllBu();

	public BusinessUnit findBuById(int businessUnit);
}
