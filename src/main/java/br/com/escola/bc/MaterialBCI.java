package br.com.escola.bc;


import java.util.List;

import br.com.escola.bean.Material;

public interface MaterialBCI {
	public void insert(Material m);
	public List<Material> select();
}
