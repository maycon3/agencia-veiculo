package com.agencia.dto;

import java.io.Serializable;

import com.agencia.domain.Veiculo;

public class VeiculoIdDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String placa;
	private String cidade;
	private String fabricante;
	private String modelo;
	
	public VeiculoIdDTO() {
	}
	
	public VeiculoIdDTO(Veiculo veiculo) {
		this.placa = veiculo.getId().getPlaca();
		this.cidade = veiculo.getId().getCidade();
		this.fabricante = veiculo.getFabricante();
		this.modelo = veiculo.getModelo();
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

	
}
