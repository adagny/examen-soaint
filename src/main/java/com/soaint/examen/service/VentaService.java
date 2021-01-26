package com.soaint.examen.service;

import com.soaint.examen.sqlite.Venta;

public interface VentaService {

	Venta save(Venta venta);

	Venta findbyId(Integer idVenta);

	Venta update(Venta venta);

	void deleteById(Integer idVenta);
}
