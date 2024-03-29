package com.portfolio.maximilianofigueroa.repository;

import com.portfolio.maximilianofigueroa.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
}
