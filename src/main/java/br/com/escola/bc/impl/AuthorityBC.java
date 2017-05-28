package br.com.escola.bc.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bc.AuthorityBCI;
import br.com.escola.bean.Authority;
import br.com.escola.dao.AuthorityDaoI;

@Controller
public class AuthorityBC implements AuthorityBCI, Serializable {

	@Autowired
	private AuthorityDaoI dao;
	
	@Transactional
	public Boolean cadastrar(Authority a) {
		dao.insert(a);
		return true;
	}

	@Transactional
	public Boolean atualizar(Authority a) {
		dao.update(a);
		return true;
	}

	@Transactional
	public Boolean excluir(Authority a) {
		dao.delete(a);
		return true;
	}

	@Transactional
	public Authority selecionar(Authority a) {
		return dao.select(a);
	}

	@Transactional
	public List<Authority> selecionar() {
		return dao.select();
	}

}
