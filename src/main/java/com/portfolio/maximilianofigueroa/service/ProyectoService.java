package com.portfolio.maximilianofigueroa.service;


import com.portfolio.maximilianofigueroa.model.Proyecto;
import com.portfolio.maximilianofigueroa.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepository proyectoRepository;

    @Autowired
    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public Proyecto agregarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public Proyecto editarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public List<Proyecto> verProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto buscarProyecto(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    public void borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }
}
