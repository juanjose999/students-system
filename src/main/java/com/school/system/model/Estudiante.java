package com.school.system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Data;

@Data
@EqualsAndHashCode(callSuper = true)
public class Estudiante extends Persona {
    private final EstadoEstudiante estadoEstudiante;

    public Estudiante(String nombreEstudiante, String apellidoEstudiante, String fechaNacimiento, EstadoEstudiante estadoEstudiante) {
        super(nombreEstudiante, apellidoEstudiante, fechaNacimiento);
        this.estadoEstudiante = estadoEstudiante;
    }
}
