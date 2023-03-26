package com.portfolio.maximilianofigueroa.controller;

import com.portfolio.maximilianofigueroa.model.Experiencia;
import com.portfolio.maximilianofigueroa.service.ExperienciaService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/agregar")
    public void agregarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.agregarExperiencia(experiencia);
    }

    @GetMapping("/ver")
    public List<Experiencia> verExperiencias() {
        return experienciaService.verExperiencias();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.editarExperiencia(experiencia);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarExperiencia(@PathVariable("id") Long id) {
        experienciaService.borrarExperiencia(id);
    }
}