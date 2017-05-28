package br.com.escola.bc.impl;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bc.UserBCI;
import br.com.escola.bean.User;
import br.com.escola.dao.UserDaoI;
import br.com.escola.util.Hash;

@Controller
public class UserBC implements UserBCI , Serializable{

	@Autowired
	private UserDaoI dao;

	@Transactional
	public Boolean cadastrar(User u) {
		try {
			u.setPassword(Hash.md5Convert(u.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		dao.insert(u);
		return true;
	}

	@Transactional
	public Boolean atualizar(User u) {
		dao.update(u);
		return true;
	}

	@Transactional
	public Boolean excluir(User u) {
		dao.delete(u);
		return true;
	}

	@Transactional
	public User selecionar(User u) {
		User us = dao.select(u);
		us.getAuthorities();
		return us;
	}

	@Transactional
	public List<User> selecionar() {
		return dao.select();
	}

}
