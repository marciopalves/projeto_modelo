package br.com.escola.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.escola.bc.ProfessorBCI;
import br.com.escola.bean.Escola;
import br.com.escola.bean.Professor;

@Component(value = "ProfessorMB")
public class ProfessorMB {
	
	@Autowired
	private ProfessorBCI controle;
	private Professor bean;
	private List<Professor> list;
	
	@PostConstruct
	public void init(){
		this.bean = new Professor();
		this.list = controle.select();
	}

	public Professor getBean() {
		return bean;
	}

	public void setBean(Professor bean) {
		this.bean = bean;
	}

	public List<Professor> getList() {
		return list;
	}

	public void setList(List<Professor> list) {
		this.list = list;
	}
	
	public void insert(){
		this.controle.insert(this.bean);
		this.init();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso!",
				"Professor cadastrada com sucesso!"));	

	}
	
	
	
	
}
