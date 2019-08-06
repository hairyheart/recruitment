package it.recruitment.dao;

import java.util.List;

import it.recruitment.dao.entity.Colloquio;

public interface ColloquioDaoInterface {

	public void addColloquio(Colloquio c);

	public List<Colloquio> findAllColloqui();

}
