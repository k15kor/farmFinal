package com.k.farmFinal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.k.farmFinal.model.Production;

@Repository
public interface ProductionDao extends PagingAndSortingRepository<Production, Integer> {
	
	
	
	
}