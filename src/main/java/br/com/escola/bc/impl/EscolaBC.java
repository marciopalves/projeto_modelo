package br.com.escola.bc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bc.EscolaBCI;
import br.com.escola.bean.Escola;
import br.com.escola.dao.EscolaDaoI;
import br.com.escola.dao.impl.EscolaDao;

@Controller
public class EscolaBC implements EscolaBCI {

	@Autowired
	private EscolaDaoI dao;
	
	public void insert(Escola e) {
		dao.insert(e);
	}

	public void delete(Escola e) {
		dao.delete(e);
		
	}

	public void update(Escola e) {
		dao.update(e);
		
	}

	public List<Escola> select() {
		return dao.select();
	}

}
