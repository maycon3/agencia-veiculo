package com.agencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.domain.Veiculo;
import com.agencia.dto.VeiculoDTO;
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

}
