package com.johanapp.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johanapp.persona.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
