package it.recruitment.service;

import java.util.List;

import it.recruitment.dao.entity.Colloquio;

public interface ColloquioServiceInterface {
	public void addColloquio(Colloquio c);

	public List<Colloquio> getAllColloqui();

}
