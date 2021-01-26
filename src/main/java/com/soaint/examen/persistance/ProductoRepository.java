package com.soaint.examen.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soaint.examen.sqlite.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
