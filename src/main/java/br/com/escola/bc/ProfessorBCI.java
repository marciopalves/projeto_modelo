package br.com.escola.bc;

import java.util.List;

import br.com.escola.bean.Professor;

public interface ProfessorBCI {
	public void insert(Professor e);
	public void delete(Professor e);
	public void update(Professor e);
	public List<Professor> select();
}
