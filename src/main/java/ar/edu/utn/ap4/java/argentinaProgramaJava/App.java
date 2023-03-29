package ar.edu.utn.ap4.java.argentinaProgramaJava;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap4.java.argentinaProgramaJava.alumno.Alumno;
import ar.edu.utn.ap4.java.argentinaProgramaJava.inscripcion.Inscripcion;
import ar.edu.utn.ap4.java.argentinaProgramaJava.inscripcion.InscripcionException;
import ar.edu.utn.ap4.java.argentinaProgramaJava.materia.Materia;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Materia m1 = new Materia("Análisis Matemático I");
    	Materia m2 = new Materia("Algebra y G. Analítica");
    	Materia m3 = new Materia("Física I");
    	Materia m4 = new Materia("Inglés I");
    	Materia m5 = new Materia("Lógica y Estructuras Discretas");
    	Materia m6 = new Materia("Algoritmos y Est. de Datos");
    	Materia m7 = new Materia("Arquitectura de Computadoras");
    	Materia m8 = new Materia("Sistemas y Procesos de Negocio");



    	List c1 = new ArrayList<Materia>();
    	c1.add(m1);
    	c1.add(m2);
    	Materia m9 = new Materia("Análisis Matemático II",c1);
    
    	Materia m10 = new Materia("Física II", m1,m3);    	
    	Materia m11 = new Materia("Ingeniería y Sociedad");
    	Materia m12 = new Materia("Inglés II",m4);
    	Materia m13 = new Materia("Sintaxis y Semántica de los Lenguajes", m5,m6);
    	Materia m14 = new Materia("Paradigmas de Programación", m5,m6);
    	Materia m15 = new Materia("Sistemas Operativos", m7);

    	Materia m16 = new Materia("Análisis de Sistemas", m6,m8);
    	
    	
    	Materia m17 = new Materia("Probabilidades y Estadísticas", m1,m2);
    	Materia m18 = new Materia("Economía");
    	Materia m21 = new Materia("Gestión de Datos", m13,m16);
    	Materia m19 = new Materia("Comunicaciones");
    	
    	
    	
       	Alumno a1 = new Alumno("MAURICIO ANTONIO AGUILERA","L252");
    	Alumno a2 = new Alumno("ANALIA MARCELA CUEVA","L791");
    	Alumno a3 = new Alumno("GERMAN GARCIA MATOSKI","L802");
    	Alumno a4 = new Alumno("ROMINA ALEJANDRA MUÑOZ","L610");
    	Alumno a5 = new Alumno("GREGORI RIVAS","L757");
    	
    	a1.addMateriaAprobada(m1);
    	a1.addMateriaAprobada(m2);
    	a1.addMateriaAprobada(m3);
    	
    	a2.addMateriaAprobada(m1);
    	a2.addMateriaAprobada(m2);
    	a2.addMateriaAprobada(m9);
    	
    	a3.addMateriaAprobada(m5);
    	a3.addMateriaAprobada(m6);
    	a3.addMateriaAprobada(m13); 	
   	
    	a5.addMateriaAprobada(m1);

    	

		try {
	    	System.out.println("Alumno "+a3.getNombreYapellido()+ " se inscribe a " + m16.getNombre());
			Inscripcion ic1 = new Inscripcion(a3,m16);
	    	System.out.println("resultado de Inscripcion es: " + ic1.aprobada());
		} catch (InscripcionException e) {
			System.out.println("ocurrio un error para el alumno "+ e.getAlumno().getNombreYapellido() + e.getMessage() + e.getMateria().toString());
			
		}
    	
    	
    	
    	
    }
}
