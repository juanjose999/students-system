package com.school.system.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Data
public class GestorAcademico {
    List<Estudiante> estudianteList = new ArrayList<>();
    List<Curso> cursoList = new ArrayList<>();
    HashMap<Curso, List<Estudiante>> cursoEstudianteHashMap = new HashMap<>();

    public GestorAcademico(List<Estudiante> estudianteList, List<Curso> cursoList, HashMap<Curso, List<Estudiante>> cursoEstudianteHashMap) {
        this.estudianteList = estudianteList;
        this.cursoList = cursoList;
        this.cursoEstudianteHashMap = cursoEstudianteHashMap;
    }
}
