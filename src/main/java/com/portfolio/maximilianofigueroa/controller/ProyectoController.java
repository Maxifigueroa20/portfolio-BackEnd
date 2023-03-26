package com.portfolio.maximilianofigueroa.controller;

import com.portfolio.maximilianofigueroa.model.Proyecto;
import com.portfolio.maximilianofigueroa.service.ProyectoService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/proyecto")
public class ProyectoController {
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/agregar")
    public void agregarProyecto(@RequestBody Proyecto proyecto) {
        proyectoService.agregarProyecto(proyecto);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyectoService.verProyectos();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto) {
        proyectoService.editarProyecto(proyecto);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarProyecto(@PathVariable("id") Long id) {
        proyectoService.borrarProyecto(id);
    }
}
