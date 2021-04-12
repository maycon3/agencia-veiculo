package com.agencia.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_proprietario")
public class Proprietario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_proprietario", nullable = false)
	private String nome;
	
	@Column(name = "telefone_proprietario")
	private String telefone;
	
	@Column(name = "email_proprietario")
	private String emil;
	
	@OneToMany(mappedBy = "proprietario")
	private List<Veiculo> veiculos = new ArrayList<>();

	
	public Proprietario() {
	}
	
	public Proprietario(Integer id, String nome, String telefone, String emil) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.emil = emil;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	
}
