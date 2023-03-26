package com.portfolio.maximilianofigueroa.repository;

import com.portfolio.maximilianofigueroa.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {
}
