package com.portfolio.maximilianofigueroa.service;

import com.portfolio.maximilianofigueroa.model.Experiencia;
import com.portfolio.maximilianofigueroa.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    public void agregarExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    public List<Experiencia> verExperiencias() {
        return experienciaRepository.findAll();
    }

    public void editarExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    public void borrarExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }
}