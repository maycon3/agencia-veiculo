package com.agencia.dto;

import java.io.Serializable;

import com.agencia.domain.Veiculo;

public class VeiculoIdDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String placa;
	private String cidade;
	private String fabricante;
	private String modelo;
	private String tipoCombustivel;
	//mais para conceito de visualizar os dados.
	private String nome;
	private String email;
	private String telefone;
	
	public VeiculoIdDTO() {
	}
	
	public VeiculoIdDTO(Veiculo veiculo) {
		this.placa = veiculo.getId().getPlaca();
		this.cidade = veiculo.getId().getCidade();
		this.fabricante = veiculo.getFabricante();
		this.modelo = veiculo.getModelo();
		this.tipoCombustivel = veiculo.getCombustivel().getDescricao();
		this.nome = veiculo.getProprietario().getNome();
		this.telefone = veiculo.getProprietario().getTelefone();
		this.email = veiculo.getProprietario().getEmil();
	}

	public String getPlaca() {
		return placa;
	}

	public String getCidade() {
		return cidade;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	//mais para conceito de visualizar os dados.
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	
}
