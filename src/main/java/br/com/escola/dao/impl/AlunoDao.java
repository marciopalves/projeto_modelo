package br.com.escola.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.escola.bean.Aluno;
import br.com.escola.dao.AlunoDaoI;

@Repository
public class AlunoDao implements AlunoDaoI {

	@Autowired
	private SessionFactory session;

	@Transactional
	public void insert(Aluno e) {
		session.getCurrentSession().persist(e);
	}

	@Transactional
	public void delete(Aluno e) {
		session.getCurrentSession().delete(e);

	}

	@Transactional
	public void update(Aluno e) {
		session.getCurrentSession().update(e);

	}

	@Transactional
	public List<Aluno> select() {
		List<Aluno> list = session.getCurrentSession()
				.createCriteria(Aluno.class).list();
		return list;
	}

}
