package com.agencia.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.agencia.enums.TipoCombustivel;

@Entity
@Table(name = "tab_veiculo")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/*@EmbeddedId
	private VeiculoId id;
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fabricante;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private Integer combustivel;
	private String placa;
	private String cidade;
	
	/* 
	 * estudo de classe de relacionamento muito para um 
	 * **/
	@ManyToOne
	private Proprietario proprietario;
	
	/*
	 * Criando relacionamento muitos para muitos
	 */
	
	@ManyToMany
	@JoinTable(name = "veiculo_acessorios",
			joinColumns = @JoinColumn(name = "cod_veiculo"),
			inverseJoinColumns = @JoinColumn(name = "cod_acessorio"))
	private Set<Acessorio> acessorios = new HashSet<>();
	
	public Veiculo(){
	}

	public Veiculo(Integer id, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel combustivel,String placa, String cidade) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.combustivel = (combustivel == null)? null:combustivel.getCod();
		this.placa = placa;
		this.cidade = cidade;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Set<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Set<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
}
