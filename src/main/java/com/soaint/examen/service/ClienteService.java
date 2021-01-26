package com.soaint.examen.service;

import org.springframework.stereotype.Service;

import com.soaint.examen.persistance.ClienteRepository;
import com.soaint.examen.sqlite.Cliente;

@Service
public class ClienteService {

	private ClienteRepository clienteRepository;

	public Cliente save(Cliente cliente) {
		Cliente clienteNuevo = new Cliente(cliente.getNombre(), cliente.getApellido(),
				cliente.getDni(), cliente.getTelefono(), cliente.getEmail());
		return clienteRepository.save(clienteNuevo);
	}

}
