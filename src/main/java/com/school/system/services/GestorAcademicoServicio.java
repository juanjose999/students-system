package com.school.system.services;

import com.school.system.model.Curso;
import com.school.system.model.Estudiante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademicoServicio implements ServiciosAcademicos {

    private final static List<Estudiante> estudianteList = new ArrayList<>();
    private final static List<Curso> cursoList = new ArrayList<>();
    public final static HashMap<Curso, List<Estudiante>> cursosHashMapEstudiantes = new HashMap<>();

    @Override
    public String matricularEstudiante(Estudiante estudiante) {
        if(estudianteList.contains(estudiante)){
            return "El estudiante ya está matriculado.";
        }else {
            estudianteList.add(estudiante);
            return "El estudiante ha sido agregado con éxito.";
        }
    }

    @Override
    public String agregarCurso(Curso curso) {
        if(cursoList.contains(curso)){
            return "El curso ya existe.";
        }else {
            cursoList.add(curso);
            cursosHashMapEstudiantes.put(curso, new ArrayList<>());
            return "El curso ha sido agregado con éxito.";
        }
    }

    @Override
    public String inscribirEstudiante(int idCurso, Estudiante estudiante) {
        Curso curso = getCursoById(idCurso);
        if (curso != null) {
            List<Estudiante> estudiantesCurso = cursosHashMapEstudiantes.get(curso);
            if (estudiantesCurso == null) {
                estudiantesCurso = new ArrayList<>();
                cursosHashMapEstudiantes.put(curso, estudiantesCurso);
            }
            if (estudiantesCurso.contains(estudiante)) {
                return "El estudiante ya está inscrito en este curso.";
            } else {
                estudiantesCurso.add(estudiante);
                return "Estudiante inscrito correctamente.";
            }
        } else {
            return "Error: el curso no existe.";
        }
    }

    @Override
    public String desinscribirEstudiante(int idEstudiante, int idCurso) {
        Curso curso = getCursoById(idCurso);
        if (curso != null) {
            List<Estudiante> estudiantesCurso = cursosHashMapEstudiantes.get(curso);
            for (Estudiante estudiante : estudiantesCurso) {
                if (estudiante.getIdPersona().equals(String.valueOf(idEstudiante))) {
                    estudiantesCurso.remove(estudiante);
                    return "Estudiante desinscrito correctamente.";
                }
            }
            return "Error: el estudiante no está inscrito en este curso.";
        } else {
            return "Error: el curso no existe.";
        }
    }

    private Curso getCursoById(int idCurso) {
        String idCursoToString = Integer.toString(idCurso);
        for (Curso c : cursoList) {
            if (c.getIdCurso().equals(idCursoToString)) {
                return c;
            }
        }
        return null;
    }
}
