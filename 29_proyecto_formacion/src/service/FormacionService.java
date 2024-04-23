package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;

public class FormacionService {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			
			)); 
	
	//añade un nuevo curso si no coinciden mismo nombre y fecha de inicio
/*	public boolean	comprobarCurso(Curso curso, String nombre, LocalDate FechaInicio) {
				if(nombre.equalsIgnoreCase(curso.getNombre())
						&&FechaInicio.equals(FechaInicio)) {
					return false;
				}
				return true;
				*/

	public boolean nuevoCurso(Curso curso) {
	if (cursos.stream().anyMatch(
			c -> c.getNombre().equals(curso.getNombre()) && c.getFechaInicio().equals(curso.getFechaInicio()))) {
		return false;
	}
	cursos.add(curso);
	return true;
}
		
	//precio medio de cursos por temática
	public double precioMedioCurso(String tematica) {
		return cursos.stream() //Stream<Curso>
				.filter(c->c.getTematica().equalsIgnoreCase(tematica))
				.collect(Collectors.averagingDouble(c->c.getPrecio()));
	}
		 
		//total cursos finalizados antes de determinada fecha
	public int cursoTotalDeteFecha(LocalDate fecha) {
		return (int)cursos.stream()
				.filter(c->c.getFechaFin().isBefore(fecha))
				.count();
	}
		
		
	//lista de cursos de la temática recibida como parámetro
	public List<Curso> cursosPorTematica(String tematica) {
		return cursos.stream()
				.filter(a->a.getTematica().equals(tematica))
				.collect(Collectors.toList());
	}
	
	//conjunto de tematicas
	public Set<String> conjuntoTematica() {
		return cursos.stream()
				.map(c->c.getTematica())//Stream<String>
				.collect(Collectors.toSet());
	}
	
	
		
	//lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetros
	public List<Curso> cursoPorPrecio (Double p1, Double p2) {
		return cursos.stream()
				.filter(c->c.getPrecio()>=p1&& c.getPrecio()<=p2)
				.collect(Collectors.toList());
		
	}	 
	//lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
	public List<Curso> cursoPorDuracion (int meses) {
		return cursos.stream()
				.filter(c -> ChronoUnit.MONTHS.between(c.getFechaInicio(), c.getFechaFin())<meses)
				.toList();
							
	}
	
		 
	
	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor el nombre del curso
	
	public Map<Long,String> tablaCurso() {
		return cursos.stream()
				.collect(Collectors.toMap(c -> ChronoUnit.MONTHS.between(c.getFechaInicio(), c.getFechaFin()), c-> c.getNombre()));
				
	}
		 
	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor la lista de cursos con dicha duración
		 
	public Map<Long,List<Curso>> tablaCursos() {
		return cursos.stream()
				.collect(Collectors.groupingBy(c -> ChronoUnit.MONTHS.between(c.getFechaInicio(), c.getFechaFin())));
				
				
	}
	//tabla con los cursos divididos entre caros y baratos. Caros, los que superen el precio recibido como parámetro
	//baratos los que no lo superen o lo igualen
	public Map<Boolean,List<Curso>> tablaCursosCaros(Double precio) {
		return cursos.stream()
				.collect(Collectors.partitioningBy(c->c.getPrecio()>precio));
				
	}
	
	
	 //cadena con los nombres de todos los cursos, separados por una coma
	public String nombresCursos() {
		return cursos.stream()
		.map(c->c.getNombre())
		.collect(Collectors.joining(","));
		
	}
		 
		 
	// nota media de un curso
	public double notaMediaCurso(String nombreCurso) {

		return cursos.stream()
        .filter(c->c.getNombre().equals(nombreCurso))
        .flatMap(c -> c.getAlumnos().stream())
        .mapToDouble(a -> a.getNota())
        .average()
        .getAsDouble();
		
	}

	//lista con los nombres de todos los alumnos
	public List<String> nombresAlumnos() {
		return cursos.stream() //Stream<Curso>
				.flatMap(c->c.getAlumnos().stream())
				.map(a->a.getNombre())
				.toList(); 
							
	}
		 
 //lista de alumnos matriculados en cursos de determinada temática
	public List<Alumno> alumnosMatriculadosTematica(String tematica) {
		return cursos.stream()
				.filter(c -> c.getTematica().equalsIgnoreCase(tematica))
				.flatMap(c -> c.getAlumnos().stream())
				.toList();
	
		
	}
	//alumno con mayor nota
	public Optional<Alumno> alumnoMayorNota() {

		return cursos.stream()
        .flatMap(c -> c.getAlumnos().stream())
        .max(Comparator.comparingDouble(a->a.getNota()));
		
	}

	
}
