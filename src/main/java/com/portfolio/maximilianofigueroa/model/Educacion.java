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
@Table(name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEducacion;

    @Column(name = "titulo")
    private String tituloEducacion;

    @Column(name = "fecha_inicio")
    private Integer fechaInicioEducacion;

    @Column(name = "fecha_fin")
    private Integer fechaFinEducacion;

    @Column(name = "imagen")
    private String imagenEducacion;
}