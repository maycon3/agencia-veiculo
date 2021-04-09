package com.agencia.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.agencia.enums.TipoCombustivel;

@Entity
@Table(name = "tab_veiculo")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private VeiculoId id;
	private String fabricante;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private Integer combustivel;
	
	/* 
	 * estudo de classe de relacionamento um para um 
	 * **/
	@OneToOne
	private Proprietario proprietario;
	
	public Veiculo(){
	}

	public Veiculo(VeiculoId id, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel combustivel) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.combustivel = (combustivel == null)? null:combustivel.getCod();
	}
	
	public VeiculoId getId() {
		return id;
	}

	public void setId(VeiculoId id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public TipoCombustivel getCombustivel() {
		return TipoCombustivel.toEnum(combustivel);
	}
	
	public void setTipoCombustivel(TipoCombustivel tipo) {
		combustivel = tipo.getCod();
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
}
