package br.com.escola.dao;

import java.util.List;

import br.com.escola.bean.Material;

public interface MaterialDaoI {
	public void insert(Material m);
	public List<Material> select();
}
