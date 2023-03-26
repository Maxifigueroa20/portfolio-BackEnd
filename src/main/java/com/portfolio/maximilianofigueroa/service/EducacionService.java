package com.portfolio.maximilianofigueroa.service;

import com.portfolio.maximilianofigueroa.model.Educacion;
import com.portfolio.maximilianofigueroa.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EducacionService {
    private final EducacionRepository educacionRepository;

    @Autowired
    public EducacionService(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }

    public void agregarEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    public List<Educacion> verEducacion() {
        return educacionRepository.findAll();
    }

    public void editarEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    public void borrarEducacion(Long id) {
        educacionRepository.deleteById(id);
    }
}