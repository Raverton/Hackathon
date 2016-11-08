package com.stefanini.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Estados;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;
import com.stefanini.model.TelefonesId;
import com.stefanini.model.TiposTel;
import com.stefanini.model.Tipotelefone;
import com.stefanini.service.ProprietarioService;

@SessionScoped
@ManagedBean(name = "proprietarioMB")
public class ProprietarioBean  implements Serializable{

	@Inject
	private ProprietarioService proprietarioservice;
	@Inject
	private Agente agente;
	@Inject
	private Telefones telefones;
	@Inject
	private Tipotelefone tpelefone;
	
	@Inject
	private Proprietario proprietario;
	
	@Inject
	private TelefonesId telefonesId;

	private Estados estados;


	public List<Tipotelefone> listartipos() {
		return proprietarioservice.buscarTelefones();
	}

	public Estados[] getStatuses() {
		return Estados.values();
	}
	
	public TiposTel[] getTiposTel() {
		return TiposTel.values();
	}
	
	public void salvar()
	{
		System.out.println("tpelefone");
		//TA CADASTRAndoO O TIPOOOO
		//proprietarioservice.cadastraTipo(tpelefone);
		
		//System.out.println(telefonesId.setCpfProprietario(proprietario.getCpfProprietario()));
		//telefonesId.setDdd(060);
		proprietario.setUf("DF");
		proprietarioservice.incluir(proprietario);
		proprietarioservice.cadastraTelefone(telefonesId);
		
		
	
	}

	public TelefonesId getTelefonesId() {
		return telefonesId;
	}

	public void setTelefonesId(TelefonesId telefonesId) {
		this.telefonesId = telefonesId;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	

	public Telefones getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefones telefones) {
		this.telefones = telefones;
	}
	
	public Tipotelefone getTipotelefone() {
		return tpelefone;
	}

	public void setTipotelefone(Tipotelefone tpelefone) {
		this.tpelefone = tpelefone;
	}
	
	

}