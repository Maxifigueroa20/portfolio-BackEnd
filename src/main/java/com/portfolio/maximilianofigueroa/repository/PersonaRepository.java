package com.portfolio.maximilianofigueroa.repository;

import com.portfolio.maximilianofigueroa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}