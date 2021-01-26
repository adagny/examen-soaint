package com.soaint.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soaint.examen.service.ProductoService;
import com.soaint.examen.sqlite.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@PostMapping("/registrar")
	public ResponseEntity<?> registrarCliente(@RequestBody Producto producto) {
		try {
			Producto productoRegistrado = productoService.save(producto);
			return new ResponseEntity<>(productoRegistrado, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{idProduto}")
	public Producto consultarProducto(@PathVariable Integer idProduto) {
		try {
			return productoService.findbyId(idProduto);
		} catch (Exception e) {
			throw e;
		}
	}
}
