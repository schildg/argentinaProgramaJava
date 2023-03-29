package ar.edu.utn.ap4.java.argentinaProgramaJava.inscripcion;

import java.util.List;

import ar.edu.utn.ap4.java.argentinaProgramaJava.alumno.Alumno;
import ar.edu.utn.ap4.java.argentinaProgramaJava.materia.Materia;

public class InscripcionException extends Exception {
	
	private final Alumno alumno;
	private final List<Materia> materia;
	private final String message;
	
	
	public InscripcionException(Alumno alumno, List<Materia> materia, String message) {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.message = message;
	}

	
	
	public Alumno getAlumno() {
		return alumno;
	}
	public List<Materia> getMateria() {
		return materia;
	}
	
	public String getMessage() {
		return message;
	}
	

	
}
