package ar.edu.utn.ap4.java.argentinaProgramaJava.inscripcion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.edu.utn.ap4.java.argentinaProgramaJava.alumno.Alumno;
import ar.edu.utn.ap4.java.argentinaProgramaJava.materia.Materia;

public class InscripcionTest {

	@Test(expected = InscripcionException.class)
	public final void validoCorrelativasNoAprobadastest() throws InscripcionException {
    	Materia m5 = new Materia("Lógica y Estructuras Discretas");
    	Materia m6 = new Materia("Algoritmos y Est. de Datos");
    	Materia m8 = new Materia("Sistemas y Procesos de Negocio");

    	Materia m13 = new Materia("Sintaxis y Semántica de los Lenguajes", m5,m6);


    	Materia m16 = new Materia("Análisis de Sistemas", m6,m8);
    	
    	Alumno a3 = new Alumno("GERMAN GARCIA MATOSKI","L802");
    	
    	a3.addMateriaAprobada(m5);
    	a3.addMateriaAprobada(m6);
    	a3.addMateriaAprobada(m13); 	

    	
		Inscripcion ic1 = new Inscripcion(a3,m16);
    	
	}

	@Test
	public final void inscripcionSinCorrelativastest() {
    	Materia m5 = new Materia("Lógica y Estructuras Discretas");
    	Materia m6 = new Materia("Algoritmos y Est. de Datos");
    	Materia m8 = new Materia("Sistemas y Procesos de Negocio");

    	Materia m13 = new Materia("Sintaxis y Semántica de los Lenguajes", m5,m6);


    	Materia m16 = new Materia("Análisis de Sistemas", m6,m8);
    	
    	Alumno a3 = new Alumno("GERMAN GARCIA MATOSKI","L802");
    	
    	a3.addMateriaAprobada(m5);
    	a3.addMateriaAprobada(m6);
    	a3.addMateriaAprobada(m13); 	

    	
		try {
			Inscripcion ic1 = new Inscripcion(a3,m8);
			assertTrue(true);
		} catch (InscripcionException e) {
			assertTrue(false);
		}
    	
	}
	
}
