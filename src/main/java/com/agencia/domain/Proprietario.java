package com.agencia.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Proprietario {

	@Column(name = "nome_proprietario", nullable = false)
	private String nome;
	
	@Column(name = "telefone_proprietario")
	private String telefone;
	
	@Column(name = "email_proprietario")
	private String emil;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}
	
	
	
}
