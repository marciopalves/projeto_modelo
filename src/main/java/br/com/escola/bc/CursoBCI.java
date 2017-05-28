package br.com.escola.bc;

import java.util.List;

import br.com.escola.bean.Curso;
import br.com.escola.bean.Escola;

public interface CursoBCI {
	public void insert(Curso e);
	public void delete(Curso e);
	public void update(Curso e);
	public List<Curso> select();

}
