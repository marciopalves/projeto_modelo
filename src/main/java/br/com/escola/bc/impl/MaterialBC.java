package br.com.escola.bc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.escola.bc.MaterialBCI;
import br.com.escola.bean.Material;
import br.com.escola.dao.MaterialDaoI;

@Controller
public class MaterialBC implements MaterialBCI {

	@Autowired
	private MaterialDaoI dao;
	
	public void insert(Material m) {
		dao.insert(m);
	}

	public List<Material> select() {
		return dao.select();
	}


}
