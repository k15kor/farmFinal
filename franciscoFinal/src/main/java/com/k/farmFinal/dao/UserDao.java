package com.k.farmFinal.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.k.farmFinal.model.User;


@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {
	
	
	
	
}
