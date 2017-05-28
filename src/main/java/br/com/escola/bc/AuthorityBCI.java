package br.com.escola.bc;

import java.util.List;

import br.com.escola.bean.Authority;

public interface AuthorityBCI {
	public Boolean cadastrar(Authority a);
	public Boolean atualizar(Authority a);
	public Boolean excluir(Authority a);
	public Authority selecionar(Authority a);
	public List<Authority> selecionar();
}
