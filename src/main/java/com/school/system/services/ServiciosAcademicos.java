package com.school.system.services;

import com.school.system.model.Curso;
import com.school.system.model.Estudiante;

public interface ServiciosAcademicos {
    String matricularEstudiante(Estudiante estudiante);
    String agregarCurso(Curso curso);
    String inscribirEstudiante(int idCurso, Estudiante estudiante);

    String desinscribirEstudiante(int idEstudiante, int idCurso);

}
