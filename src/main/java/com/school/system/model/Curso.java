package com.school.system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "idCurso")
public class Curso {
    private static int countId = 1;
    private final String idCurso;
    private final String nombreCurso;
    private final String descripcionCurso;
    private final int numeroCreditos;
    private final int version;

    public Curso(String nombreCurso, String descripcionCurso, int numeroCreditos, int version) {
        this.idCurso = generateId();
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    private String generateId() {
        return String.valueOf(countId++);
    }
}

