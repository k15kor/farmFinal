package com.k.farmFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k.farmFinal.dao.ProductionDao;
import com.k.farmFinal.model.Production;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class ProductionServiceImpl implements ProductionService {

	@Autowired
	private ProductionDao dao;

	@Override
	public Production create(Production t) {
		return dao.save(t);
	}

	@Override
	public void delete(Production t) {
		dao.delete(t);
	}

	@Override
	public void update(Production t) {
		dao.save(t);
	}

	@Override
	public List<Production> getAll() {
		final List<Production> productions = new ArrayList<>();
		dao.findAll().forEach(u -> productions.add(u));
		return productions;
	}

	@Override
	public Production findById(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Page<Production> listAllByPage(Pageable pageable) {
		return dao.findAll(pageable);
	}

	
	

}
