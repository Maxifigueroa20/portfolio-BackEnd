package com.portfolio.maximilianofigueroa.service;

import com.portfolio.maximilianofigueroa.model.Habilidad;
import com.portfolio.maximilianofigueroa.repository.HabilidadRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HabilidadService {

    private final HabilidadRepository habilidadRepository;

    public HabilidadService(HabilidadRepository habilidadRepository) {
        this.habilidadRepository = habilidadRepository;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    public List<Habilidad> verHabilidades() {
        return habilidadRepository.findAll();
    }

    public void editarHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    public void borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }
}