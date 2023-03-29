package ar.edu.utn.ap4.java.argentinaProgramaJava.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class MateriaTest {

	@Test
	public final void validoMateriasCorrelativasAlInstanciartest() {
    	Materia m1 = new Materia("Análisis Matemático I");
    	assertNotNull(m1.getCorrelativas());
    	assertTrue(m1.getCorrelativas().isEmpty());

	}

}
