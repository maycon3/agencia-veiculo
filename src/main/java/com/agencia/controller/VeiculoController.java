package com.agencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.domain.Veiculo;
import com.agencia.domain.VeiculoId;
import com.agencia.dto.VeiculoDTO;
import com.agencia.dto.VeiculoIdDTO;
import com.agencia.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;

	@PostMapping
	public ResponseEntity<Void> save(@RequestBody() VeiculoDTO dto){
		System.out.println("ano fabricacao "+ dto.getAnoFabricacao());
		System.out.println("Fabricante "+ dto.getFabricante());
		Veiculo veiculo = veiculoService.converte(dto);
		veiculoService.save(veiculo);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<VeiculoIdDTO> find(@RequestParam(required = false) String placa,
			@RequestParam(required = false) String cidade){
		VeiculoId id = new VeiculoId(placa,cidade);
		Veiculo veiculo = veiculoService.find(id);
		VeiculoIdDTO dto = new VeiculoIdDTO(veiculo);
		return ResponseEntity.ok().body(dto);
	}

}
