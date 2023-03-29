package ar.edu.utn.ap4.java.argentinaProgramaJava.inscripcion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.utn.ap4.java.argentinaProgramaJava.alumno.Alumno;
import ar.edu.utn.ap4.java.argentinaProgramaJava.materia.Materia;

public class Inscripcion {
	
	private Alumno alumno;
	
	private Materia materia;
	
	private Date fechaInscripcion;

	public Inscripcion(Alumno alumno, Materia materia) throws InscripcionException {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.fechaInscripcion = new Date();
		aprobada();
	}
	
	
	public boolean aprobada() throws InscripcionException {
		List<Materia> materiasCorrelativasNecesarias = new ArrayList<Materia>();
		
		for(Materia matCorr : this.materia.getCorrelativas()) {

			if(!this.alumno.getMateriasAprobadas().contains(matCorr)) {
				//System.out.println(" necesita tener aprobada "+matCorr.getNombre());
				materiasCorrelativasNecesarias.add(matCorr);
			}			
		}	
		if(!materiasCorrelativasNecesarias.isEmpty()) {
			throw new InscripcionException(this.alumno,materiasCorrelativasNecesarias," necesita tener aprobadas las materias ");
		}else {
			return true;
		}
				
	}


}
