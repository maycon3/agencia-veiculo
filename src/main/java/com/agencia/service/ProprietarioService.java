package com.agencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.domain.Proprietario;
import com.agencia.dto.VeiculoDTO;
import com.agencia.repositoreis.ProprietarioRepository;

@Service
public class ProprietarioService {

	
	@Autowired
	private ProprietarioRepository proprietarioRepo;
	
	public Proprietario save(Proprietario proprietario) {
		proprietario.setId(null);
		return proprietarioRepo.save(proprietario);
	}
	
	public Proprietario converte(VeiculoDTO dto) {
		return new Proprietario(null,dto.getNome(),dto.getTelefone(),dto.getEmail());
	}
}
