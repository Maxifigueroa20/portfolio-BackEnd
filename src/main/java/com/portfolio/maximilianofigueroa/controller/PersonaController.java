package com.portfolio.maximilianofigueroa.controller;

import com.portfolio.maximilianofigueroa.model.Persona;
import com.portfolio.maximilianofigueroa.service.PersonaService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/agregar")
    public void agregarPersona(@RequestBody Persona persona) {
        personaService.agregarPersona(persona);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
        return personaService.verPersonas();
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable("id") Long id) {
        return personaService.buscarPersona(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona persona) {
        personaService.editarPersona(persona);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable("id") Long id) {
        personaService.borrarPersona(id);
    }
}