package br.com.escola.bc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bc.AlunoBCI;
import br.com.escola.bean.Aluno;
import br.com.escola.dao.AlunoDaoI;

@Controller
public class AlunoBC implements AlunoBCI {

	@Autowired
	private AlunoDaoI dao;
	
	public void insert(Aluno e) {
		dao.insert(e);
	}

	public void delete(Aluno e) {
		dao.delete(e);
		
	}

	public void update(Aluno e) {
		dao.update(e);
		
	}

	public List<Aluno> select() {
		return dao.select();
	}

}
