package br.com.escola.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bean.Escola;
import br.com.escola.bean.Professor;
import br.com.escola.dao.ProfessorDaoI;

@Repository
public class ProfessorDao implements ProfessorDaoI {

	@Autowired
	private SessionFactory session;

	@Transactional
	public void insert(Professor e) {
		session.getCurrentSession().persist(e);
	}

	@Transactional
	public void delete(Professor e) {
		session.getCurrentSession().delete(e);

	}

	@Transactional
	public void update(Professor e) {
		session.getCurrentSession().update(e);

	}

	@Transactional
	public List<Professor> select() {
		List<Professor> list = session.getCurrentSession()
				.createCriteria(Professor.class).list();
		return list;
	}

}
