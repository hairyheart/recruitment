package com.recruitment.service;

import java.util.List;

import com.recruitment.dao.entity.Colloquio;

public interface ColloquioServiceInterface {
	public void addColloquio(Colloquio c);

	public List<Colloquio> getAllColloqui();

}
