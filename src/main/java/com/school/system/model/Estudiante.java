package com.school.system.model;

import lombok.Data;

@Data
public class Estudiante {
    private String idEstudiante;
    private int countId = 1;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String fechaNaciemto;
    private EstadoEstudiante estadoEstudiante;

    public Estudiante( int countId, String nombreEstudiante, String apellidoEstudiante, String fechaNaciemto, EstadoEstudiante estadoEstudiante) {
        this.idEstudiante = Integer.toString(countId);
        this.countId = countId;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.fechaNaciemto = fechaNaciemto;
        this.estadoEstudiante = estadoEstudiante;
        countId++;
    }
}
