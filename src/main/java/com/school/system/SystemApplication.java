package com.school.system;

import com.school.system.model.Curso;
import com.school.system.model.EstadoEstudiante;
import com.school.system.model.Estudiante;
import com.school.system.services.GestorAcademicoServicio;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SystemApplication {

	public static void main(String[] args) {
		GestorAcademicoServicio gestorAcademicoServicio = new GestorAcademicoServicio();
		Estudiante estudiante = new Estudiante("juan jose","Sierra ortega", "1999-12-14", EstadoEstudiante.ACTIVO);
		Estudiante estudiante1 = new Estudiante("Jamilton","Palmira", "1998-12-14", EstadoEstudiante.ACTIVO);
		Estudiante estudiante2 = new Estudiante("Maria","Diaz", "1999-12-11", EstadoEstudiante.MATRICULADO);
		Estudiante estudiante3 = new Estudiante("Daniel","Agudelo", "1993-01-14", EstadoEstudiante.ACTIVO);
		Estudiante estudiante4 = new Estudiante("Jairo","fernandes", "1954-11-14", EstadoEstudiante.GRADUADO);

		gestorAcademicoServicio.matricularEstudiante(estudiante);
		gestorAcademicoServicio.matricularEstudiante(estudiante1);
		gestorAcademicoServicio.matricularEstudiante(estudiante2);
		gestorAcademicoServicio.matricularEstudiante(estudiante3);
		gestorAcademicoServicio.matricularEstudiante(estudiante4);


		Curso curso = new Curso("programacion","diseño de apis, base de datos en java.",4,1);
		Curso curso1 = new Curso("diseno grafico","diseño de apis, base de datos en java.",4,1);
		Curso curso2 = new Curso("literatura","diseño de apis, base de datos en java.",4,1);

		gestorAcademicoServicio.agregarCurso(curso);
		gestorAcademicoServicio.agregarCurso(curso1);
		gestorAcademicoServicio.agregarCurso(curso2);

		gestorAcademicoServicio.inscribirEstudiante(Integer.parseInt(curso2.getIdCurso()), estudiante3);
		gestorAcademicoServicio.inscribirEstudiante(Integer.parseInt(curso2.getIdCurso()), estudiante2);
		gestorAcademicoServicio.inscribirEstudiante(Integer.parseInt(curso.getIdCurso()), estudiante);

		for (Map.Entry<Curso, List<Estudiante>> entry : GestorAcademicoServicio.cursosHashMapEstudiantes.entrySet()) {
			Curso curs = entry.getKey();
			List<Estudiante> estudiantes = entry.getValue();

			System.out.print("\tCurso - " + curs.getNombreCurso()+" - ");
			System.out.println(" Estudiantes inscritos:");
			for (Estudiante estudiant : estudiantes) {
				System.out.println("\t\t- " + estudiant.getNombreEstudiante() + " " + estudiant.getApellidoEstudiante());
			}
			System.out.println("----------------------------------------------------");

		}


	}

}
