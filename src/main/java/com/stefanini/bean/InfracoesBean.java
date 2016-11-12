package com.stefanini.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;
import com.stefanini.service.InfracoesService;

@SessionScoped
@ManagedBean(name="infracoesMB")
public class InfracoesBean {
	
	@Inject
	private InfracoesService infracoesService;
	
	@Inject
	private Infracoes infracoes;
	
	public void passar() throws IOException {
	       
		infracoesService.salvar(this.infracoes);
		infracoes = new Infracoes();
		FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
	}
	


	public Infracoes getInfracoes() {
		return infracoes;
	}



	public void setInfracoes(Infracoes infracoes) {
		this.infracoes = infracoes;
	}



	public List<Infracoes> Listar()
	{
		return infracoesService.listarInfracoes();
	} 

}
