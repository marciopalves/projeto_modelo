package br.com.escola.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.escola.bc.CursoBCI;
import br.com.escola.bean.Curso;

@Component(value = "CursoMB")
public class CursoMB {
	
	@Autowired
	private CursoBCI controle;
	private Curso bean;
	private List<Curso> list;
	
	@PostConstruct
	public void init(){
		this.bean = new Curso();
		this.list = controle.select();
	}

	public Curso getBean() {
		return bean;
	}

	public void setBean(Curso bean) {
		this.bean = bean;
	}

	public List<Curso> getList() {
		return list;
	}

	public void setList(List<Curso> list) {
		this.list = list;
	}
	
	public void insert(){
		this.controle.insert(this.bean);
		this.init();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso!",
				"Curso cadastrada com sucesso!"));	

	}
	
	
	
	
}
