package ar.edu.utn.ap4.java.argentinaProgramaJava.materia;

import java.util.ArrayList;
import java.util.List;

public class Materia {



	private String nombre;
	
	private List<Materia> correlativas;

	public Materia(String nombre) {
		super();
		this.nombre = nombre;
		this.correlativas = new ArrayList<Materia>();
	}

	public Materia(String nombre, List<Materia> correlativas) {
		super();
		this.nombre = nombre;
		this.correlativas = correlativas;
	}
	
	public Materia(String nombre, Materia ...materias ) {
		super();
		this.nombre = nombre;
		this.correlativas = new ArrayList<Materia>();
		for (Materia matCorr: materias) {
			this.correlativas.add(matCorr);
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}
	

	
}
