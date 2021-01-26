package com.soaint.examen.sqlite;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDetalleVenta;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Venta.class)
	private List<Integer> idVenta;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Producto.class)
	private Integer idProducto;

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public List<Integer> getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(List<Integer> idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

}
