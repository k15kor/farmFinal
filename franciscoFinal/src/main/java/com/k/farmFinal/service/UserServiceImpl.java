package com.k.farmFinal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.k.farmFinal.dao.UserDao;
import com.k.farmFinal.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User create(User t) {
		return dao.save(t);
	}

	@Override
	public void delete(User t) {
		dao.delete(t);
	}

	@Override
	public void update(User t) {
		dao.save(t);
	}

	@Override
	public List<User> getAll() {
		final List<User> users = new ArrayList<>();
		dao.findAll().forEach(u -> users.add(u));
		return users;
	}

	@Override
	public User findById(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Page<User> listAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

}
