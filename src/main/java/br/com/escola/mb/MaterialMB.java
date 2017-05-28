package br.com.escola.mb;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.escola.bc.MaterialBCI;
import br.com.escola.bean.Material;

@Component( value = "MaterialMB")
public class MaterialMB {
	
	private Material bean;
	@Autowired
	private MaterialBCI controle;
	private List<Material> list;
	
	@PostConstruct
	public void init(){
		this.bean = new Material();
		this.list = controle.select();
	}

	public Material getBean() {
		return bean;
	}

	public void setBean(Material bean) {
		this.bean = bean;
	}

	public List<Material> getList() {
		return list;
	}

	public void setList(List<Material> list) {
		this.list = list;
	}
	
	public void cadastrar(){
		this.controle.insert(this.bean);
		this.init();
	}
	
}
