package com.soaint.examen.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soaint.examen.sqlite.Cliente;
import com.soaint.examen.sqlite.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
