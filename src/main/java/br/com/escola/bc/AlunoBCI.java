package br.com.escola.bc;

import java.util.List;

import br.com.escola.bean.Aluno;

public interface AlunoBCI {
	public void insert(Aluno e);
	public void delete(Aluno e);
	public void update(Aluno e);
	public List<Aluno> select();
}
