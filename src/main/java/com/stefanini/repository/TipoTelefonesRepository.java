package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.TelefonesId;
import com.stefanini.model.Tipotelefone;

public class TipoTelefonesRepository {
	
	@Inject
	private EntityManager manager;
	
	public List<Tipotelefone> listar() {
		return this.manager.createQuery("select tt from tipotelefone tt", Tipotelefone.class).getResultList();
	}
	
//	 public Collection<Tipotelefone> findAllProfessors() {
//		    Query query = manager.createQuery("SELECT e FROM Professor e");
//		    return (Collection<Tipotelefone>) query.getResultList();
//		  }
	
	
	public void CadastraTipo(Tipotelefone tipotelefone) {
		this.manager.persist(tipotelefone);
	}

	public void CadastraTelefone(TelefonesId telefone) {
		this.manager.persist(telefone);
	}

	
}
