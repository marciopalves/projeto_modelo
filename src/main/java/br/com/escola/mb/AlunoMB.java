package br.com.escola.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.escola.bc.AlunoBCI;
import br.com.escola.bean.Aluno;

@Component(value = "AlunoMB")
public class AlunoMB {
	
	@Autowired
	private AlunoBCI controle;
	private Aluno bean;
	private List<Aluno> list;
	
	@PostConstruct
	public void init(){
		this.bean = new Aluno();
		this.list = controle.select();
	}

	public Aluno getBean() {
		return bean;
	}

	public void setBean(Aluno bean) {
		this.bean = bean;
	}

	public List<Aluno> getList() {
		return list;
	}

	public void setList(List<Aluno> list) {
		this.list = list;
	}
	
	public void insert(){
		this.controle.insert(this.bean);
		this.init();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso!",
				"Aluno cadastrada com sucesso!"));	

	}
	
	
	
	
}
