package com.k.farmFinal.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;


public interface CRUD<T, ID extends Serializable> {

	T create(T t);

	void delete(T t);

	void update(T t);

	List<T> getAll();
	
	Page<T> listAllByPage(Pageable pageable);
	
	T findById(ID id);

	

}
