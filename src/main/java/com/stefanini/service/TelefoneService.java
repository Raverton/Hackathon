package com.stefanini.service;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;
import com.stefanini.repository.TelefoneRepository;

public class TelefoneService {

	
	@Inject
	private TelefoneRepository telefonesRepository;
	
    public void salvar(Telefones telefones){
    	telefonesRepository.salvar(telefones);
    }
    
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Telefones> listarProprietario() {
		return telefonesRepository.lista();
	}
	
	public void excluir(Integer id){
		telefonesRepository.Excluir(id);
	}
    
    public Telefones buscarTelefone(Integer id){
    	return telefonesRepository.busca(id);
    }
	
}
