package br.com.escola.bc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bc.CursoBCI;
import br.com.escola.bean.Curso;
import br.com.escola.dao.CursoDaoI;

@Controller
public class CursoBC implements CursoBCI {

	@Autowired
	private CursoDaoI dao;
	
	public void insert(Curso e) {
		dao.insert(e);
	}

	public void delete(Curso e) {
		dao.delete(e);
		
	}

	public void update(Curso e) {
		dao.update(e);
		
	}

	public List<Curso> select() {
		return dao.select();
	}

}
