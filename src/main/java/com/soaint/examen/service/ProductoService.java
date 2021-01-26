package com.soaint.examen.service;

import com.soaint.examen.sqlite.Producto;

public interface ProductoService {
	public Producto save(Producto producto);

	public Producto findbyId(Integer idProducto);
}
