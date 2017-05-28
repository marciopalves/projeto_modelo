package br.com.escola.bc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bc.ProfessorBCI;
import br.com.escola.bean.Professor;
import br.com.escola.dao.ProfessorDaoI;

@Controller
public class ProfessorBC implements ProfessorBCI {

	@Autowired
	private ProfessorDaoI dao;
	
	public void insert(Professor e) {
		dao.insert(e);
	}

	public void delete(Professor e) {
		dao.delete(e);
		
	}

	public void update(Professor e) {
		dao.update(e);
		
	}

	public List<Professor> select() {
		return dao.select();
	}

}
