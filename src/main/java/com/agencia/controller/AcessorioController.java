package com.agencia.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.agencia.domain.Acessorio;
import com.agencia.service.AcessorioService;

@RestController
@RequestMapping(value = "/acessorio")
public class AcessorioController {

	@Autowired
	private AcessorioService acessorioService;
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody Acessorio acessorio){
		acessorio = acessorioService.save(acessorio);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(acessorio.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
