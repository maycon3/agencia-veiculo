package com.agencia.enums;

public enum TipoCombustivel {

	ALCOOL(1,"Alcool"),
	GASOLINA(2,"Gasolina"),
	DIESEL(3,"Diesel"),
	BICOMBUSTIVEL(4,"BicomBustivel");
	
	private int cod;
	private String descricao;
	
	private TipoCombustivel(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCombustivel toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCombustivel x: TipoCombustivel.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código inválido: "+ cod);
	}
}
