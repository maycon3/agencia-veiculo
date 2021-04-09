package com.agencia.dto;

import java.math.BigDecimal;

public class VeiculoDTO {

	private String placa;
	private String cidade;
	private String fabricante;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private Integer tipoCombustivel;
	
	//Criação de veriaveis para embutir os novos valores de classe
	private String nome;
	private String telefone;
	private String email;
	
	public VeiculoDTO() {
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

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Integer getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	//metodos para estudo de classe embutida

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}


	
	
	
	
}
