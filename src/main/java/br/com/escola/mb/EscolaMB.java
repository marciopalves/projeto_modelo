package br.com.escola.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.escola.bc.EscolaBCI;
import br.com.escola.bean.Escola;

@Component(value = "EscolaMB")
public class EscolaMB {
	
	@Autowired
	private EscolaBCI controle;
	private Escola bean;
	private List<Escola> list;
	
	@PostConstruct
	public void init(){
		this.bean = new Escola();
		this.list = controle.select();
	}

	public Escola getBean() {
		return bean;
	}

	public void setBean(Escola bean) {
		this.bean = bean;
	}

	public List<Escola> getList() {
		return list;
	}

	public void setList(List<Escola> list) {
		this.list = list;
	}
	
	public void insert(){
		this.controle.insert(this.bean);
		this.init();

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso!",
				"Escola cadastrada com sucesso!"));	

	}
	
	
	
	
}
