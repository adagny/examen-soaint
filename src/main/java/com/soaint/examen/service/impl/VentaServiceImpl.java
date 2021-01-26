package com.soaint.examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soaint.examen.persistance.ClienteRepository;
import com.soaint.examen.persistance.VentaRepository;
import com.soaint.examen.service.VentaService;
import com.soaint.examen.sqlite.Cliente;
import com.soaint.examen.sqlite.Producto;
import com.soaint.examen.sqlite.Venta;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaRepository ventaRepository;

	@Override
	public Venta save(Venta venta) {
		return ventaRepository.save(venta);
	}

	@Override
	public Venta findbyId(Integer idVenta) {
		return ventaRepository.findById(idVenta).get();
	}

	@Override
	public Venta update(Venta venta) {
		return ventaRepository.save(venta);
	}

	@Override
	public void deleteById(Integer idVenta) {
		ventaRepository.deleteById(idVenta);
	}

}
