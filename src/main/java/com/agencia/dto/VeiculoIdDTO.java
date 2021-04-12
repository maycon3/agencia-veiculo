package com.agencia.dto;

import java.io.Serializable;
import java.util.Set;

import com.agencia.domain.Acessorio;
import com.agencia.domain.Veiculo;

public class VeiculoIdDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String placa;
	private String cidade;
	private String fabricante;
	private String modelo;
	private String tipoCombustivel;
	private Set<Acessorio> acessorios;
	
	public VeiculoIdDTO() {
	}
	
	public VeiculoIdDTO(Veiculo veiculo) {
		this.placa = veiculo.getPlaca();
		this.cidade = veiculo.getCidade();
		this.fabricante = veiculo.getFabricante();
		this.modelo = veiculo.getModelo();
		this.tipoCombustivel = veiculo.getCombustivel().getDescricao();
		this.acessorios = veiculo.getAcessorios();
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

	public Set<Acessorio> getAcessorios() {
		return acessorios;
	}
	
	
	
	
}
