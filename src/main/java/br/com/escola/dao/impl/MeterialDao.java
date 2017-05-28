package br.com.escola.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bean.Material;
import br.com.escola.dao.MaterialDaoI;

@Repository
public class MeterialDao implements MaterialDaoI {
	
	@Autowired
	private SessionFactory session;
	
	@Transactional
	public void insert(Material m) {
		this.session.getCurrentSession().persist(m);
	}

	@Transactional
	public List<Material> select() {
		return this.session.
				getCurrentSession()
				.createCriteria(Material.class)
				.list();
	}

}
