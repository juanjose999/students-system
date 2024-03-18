package com.school.system.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Data
public class Persona {
    private static int countId = 1;
    private final String idPersona;
    private final String nombreEstudiante;
    private final String apellidoEstudiante;
    private final String fechaNacimiento;

    public Persona() {
        this.idPersona = generateId();
        this.nombreEstudiante = "";
        this.apellidoEstudiante = "";
        this.fechaNacimiento = "";
    }

    public Persona(String nombreEstudiante, String apellidoEstudiante, String fechaNacimiento) {
        this.idPersona = generateId();
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }

    private String generateId() {
        return String.valueOf(countId++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return idPersona.equals(persona.idPersona);
    }

    @Override
    public int hashCode() {
        return idPersona.hashCode();
    }
}
