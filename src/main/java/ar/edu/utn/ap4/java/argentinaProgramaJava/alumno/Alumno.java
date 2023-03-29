package ar.edu.utn.ap4.java.argentinaProgramaJava.alumno;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap4.java.argentinaProgramaJava.materia.Materia;

public class Alumno {
	
	private String nombreYapellido;
	
	private String legajo;
	
	private List<Materia> materiasAprobadas;

	
	
	public Alumno(String nombreYapellido, String legajo) {
		super();
		this.nombreYapellido = nombreYapellido;
		this.legajo = legajo;
		this.materiasAprobadas = new ArrayList<Materia>();
	}
	
	public void addMateriaAprobada(Materia materia) {
		this.materiasAprobadas.add(materia);
	}

	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public String getNombreYapellido() {
		return nombreYapellido;
	}



}
