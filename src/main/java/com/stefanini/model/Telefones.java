package com.stefanini.model;
// Generated 07/11/2016 12:04:56 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Telefones generated by hbm2java
 */
@Entity
@Table(name = "telefones", catalog = "hackaton")
public class Telefones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer numero;

	private Integer ddd;

	@ManyToOne
	@JoinColumn(name = "PROP_ID")
	private Proprietario proprietario;;

	@ManyToOne
	@JoinColumn(name = "TIPO_ID")
	private Tipotelefone tipotelefone;

	public Telefones() {
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Tipotelefone getTipotelefone() {
		return tipotelefone;
	}

	public void setTipotelefone(Tipotelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}

}
