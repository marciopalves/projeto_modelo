package br.com.escola.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bean.Curso;
import br.com.escola.bean.Escola;
import br.com.escola.dao.CursoDaoI;

@Repository
public class CursoDao implements CursoDaoI {

	@Autowired
	private SessionFactory session;

	@Transactional
	public void insert(Curso e) {
		session.getCurrentSession().persist(e);
	}

	@Transactional
	public void delete(Curso e) {
		session.getCurrentSession().delete(e);

	}

	@Transactional
	public void update(Curso e) {
		session.getCurrentSession().update(e);

	}

	@Transactional
	public List<Curso> select() {
		List<Curso> list = session.getCurrentSession()
				.createCriteria(Curso.class).list();
		return list;
	}

}
