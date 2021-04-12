package com.agencia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencia.domain.Acessorio;
import com.agencia.domain.Proprietario;
import com.agencia.domain.Veiculo;
import com.agencia.domain.VeiculoId;
import com.agencia.dto.VeiculoDTO;
import com.agencia.enums.TipoCombustivel;
import com.agencia.repositoreis.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepo;
	
	@Autowired
	private AcessorioService acessorioService;
	
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepo.save(veiculo);
	}
	
	public void saveAll(List<Veiculo>veiculos) {
		 veiculoRepo.saveAll(veiculos);
	}
	
	public Veiculo find(Integer id) {
		Optional<Veiculo> veiculo = veiculoRepo.findById(id);
		return veiculo.get();
	}
	
	public List<Veiculo> converte(VeiculoDTO dto,Proprietario p) {
		/*VeiculoId id = new VeiculoId(dto.getPlaca(),dto.getCidade());
		return new Veiculo(id, dto.getFabricante(),dto.getModelo(),dto.getAnoFabricacao(),
				dto.getAnoModelo(),dto.getValor(), TipoCombustivel.toEnum(dto.getTipoCombustivel()));*/
		List<Veiculo> veiculos = new ArrayList<>();
		dto.getVeiculoDtos().forEach(v ->{
			//VeiculoId id = new VeiculoId(v.getPlaca(),v.getCidade());
			Veiculo novoVeiculo = new Veiculo(null,v.getFabricante(),v.getModelo(),v.getAnoFabricacao(),v.getAnoModelo(),
					v.getValor(), TipoCombustivel.toEnum(v.getTipoCombustivel()),v.getPlaca(), v.getCidade());
			v.getTipoAcessorio().forEach(t->{
				Acessorio acessorio = acessorioService.find(t);
				novoVeiculo.getAcessorios().add(acessorio);
			});
			novoVeiculo.setProprietario(p);
			veiculos.add(novoVeiculo);
		});
		
		return veiculos;
	}

}
