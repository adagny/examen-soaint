package com.soaint.examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soaint.examen.persistance.ClienteRepository;
import com.soaint.examen.persistance.ProductoRepository;
import com.soaint.examen.service.ProductoService;
import com.soaint.examen.sqlite.Cliente;
import com.soaint.examen.sqlite.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto findbyId(Integer idProducto) {
		return productoRepository.findById(idProducto).get();
	}

}
