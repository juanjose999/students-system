package com.school.system.model;

import lombok.Data;

@Data
public class Curso {
    private String idCurso;
    private int countId = 1;
    private String nombreCurso;
    private String descripcionCurso;
    private int numeroCreditos;
    private int version;

    public Curso(String nombreCurso, String descripcionCurso, int numeroCreditos, int version) {
        this.idCurso = Integer.toString(countId);
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
        countId++;
    }
}
