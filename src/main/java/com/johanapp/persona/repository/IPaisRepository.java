package com.johanapp.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johanapp.persona.model.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long>{

}
