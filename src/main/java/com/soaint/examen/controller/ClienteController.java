package com.soaint.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soaint.examen.service.ClienteService;
import com.soaint.examen.sqlite.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@PostMapping("/registrar")
	public ResponseEntity<?> registrarCliente(@RequestBody Cliente cliente) {
		try {
			Cliente clienteRegistrado = clienteService.save(cliente);
			return new ResponseEntity<>(clienteRegistrado, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
