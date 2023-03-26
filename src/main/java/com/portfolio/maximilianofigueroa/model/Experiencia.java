package com.portfolio.maximilianofigueroa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idExperiencia;

    @Column(name = "titulo")
    private String tituloExperiencia;

    @Column(name = "fecha_inicio")
    private Integer fechaInicioExperiencia;

    @Column(name = "fecha_fin")
    private Integer fechaFinExperiencia;

    @Column(name = "imagen")
    private String imagenExperiencia;
}