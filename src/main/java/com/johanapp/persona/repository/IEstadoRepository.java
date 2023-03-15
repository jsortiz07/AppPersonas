package com.johanapp.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johanapp.persona.model.Estado;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Long> {

}
