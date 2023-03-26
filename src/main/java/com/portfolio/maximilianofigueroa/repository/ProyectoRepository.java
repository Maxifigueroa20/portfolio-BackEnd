package com.portfolio.maximilianofigueroa.repository;

import com.portfolio.maximilianofigueroa.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
}
