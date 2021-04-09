package com.agencia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.domain.Veiculo;
import com.agencia.domain.VeiculoId;
import com.agencia.dto.VeiculoDTO;
import com.agencia.repositoreis.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepo;
	
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepo.save(veiculo);
	}
	
	public Veiculo find(VeiculoId id) {
		Optional<Veiculo> veiculo = veiculoRepo.findById(id);
		return veiculo.get();
	}
	
	public Veiculo converte(VeiculoDTO dto) {
		VeiculoId id = new VeiculoId(dto.getPlaca(),dto.getCidade());
		return  new Veiculo(id, dto.getFabricante(),dto.getModelo(),dto.getAnoFabricacao(),
				dto.getAnoModelo(),dto.getValor());
	}

}
