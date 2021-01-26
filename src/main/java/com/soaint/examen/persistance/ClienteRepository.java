package com.soaint.examen.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soaint.examen.sqlite.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
