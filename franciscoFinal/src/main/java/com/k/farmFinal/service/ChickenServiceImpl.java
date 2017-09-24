package com.k.farmFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k.farmFinal.dao.ChickenDao;
import com.k.farmFinal.model.Chicken;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class ChickenServiceImpl implements ChickenService {

	@Autowired
	private ChickenDao dao;

	@Override
	public Chicken create(Chicken t) {
		return dao.save(t);
	}

	@Override
	public void delete(Chicken t) {
		dao.delete(t);
	}

	@Override
	public void update(Chicken t) {
		dao.save(t);
	}

	@Override
	public List<Chicken> getAll() {
		final List<Chicken> chickens = new ArrayList<>();
		dao.findAll().forEach(u -> chickens.add(u));
		return chickens;
	}

	@Override
	public Chicken findById(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Page<Chicken> listAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

	
	

}
