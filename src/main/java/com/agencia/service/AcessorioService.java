package com.agencia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.domain.Acessorio;
import com.agencia.repositoreis.AcessorioRepository;

@Service
public class AcessorioService {

	@Autowired
	private AcessorioRepository acessorioRepo;
	
	public Acessorio save(Acessorio acessorio) {
		acessorio.setId(null);
		return acessorioRepo.save(acessorio);
	}
	
	public Acessorio find(Integer id) {
		Optional<Acessorio> acessorio = acessorioRepo.findById(id);
		return acessorio.get();
	}
}
