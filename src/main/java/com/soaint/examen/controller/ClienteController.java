package com.soaint.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soaint.examen.service.impl.ClienteServiceImpl;
import com.soaint.examen.sqlite.Cliente;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private static final Logger LOGGER = LogManager.getLogger(ClienteController.class);
	
	@Autowired
	ClienteServiceImpl clienteService;

	@PostMapping("/registrar")
	public ResponseEntity<?> registrarCliente(@RequestBody Cliente cliente) {
		try {
			Cliente clienteRegistrado = clienteService.save(cliente);
			LOGGER.info("cliente registrado");
			return new ResponseEntity<>(clienteRegistrado, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.error("error"+e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
