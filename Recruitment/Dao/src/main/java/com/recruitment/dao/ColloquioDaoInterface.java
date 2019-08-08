package com.recruitment.dao;

import java.util.List;

import com.recruitment.dao.entity.Colloquio;

public interface ColloquioDaoInterface {

	public void addColloquio(Colloquio c);

	public List<Colloquio> findAllColloqui();

}
