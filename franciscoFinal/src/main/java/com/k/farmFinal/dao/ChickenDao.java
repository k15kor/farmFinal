package com.k.farmFinal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.k.farmFinal.model.Chicken;

@Repository
public interface ChickenDao extends PagingAndSortingRepository<Chicken,Integer>{

}
