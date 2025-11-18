package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Curso(){
		
		estudiantes = new ArrayList<Estudiante>();
	}
	
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		
		Estudiante elementoEstudiante = null;
		Estudiante estudianteEncontrado = null;
		String mensaje= null;
		
		for(int i=0 ;i<estudiantes.size();i++) {
			
			elementoEstudiante = estudiantes.get(i);
			
			if(elementoEstudiante.getCedula().equals(estudiante.getApellido())) {
				estudianteEncontrado = elementoEstudiante;
			}
			
		}
		
		if(estudianteEncontrado != null) {
			return mensaje="El estudiante se encontro en el curso";
		}else {
			return mensaje;
		}
		
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		
		String inscripcionEstudiante =buscarEstudiantePorCedula(estudiante);
		
		if(inscripcionEstudiante == null) {
			
			estudiantes.add(estudiante);
			
		}
	
	}
	
	public double calcularPromedioCurso() {
		
	    Estudiante elementoEstudiante =null;
	    double promedioEstudiante =0;
	    double sumaPromediosEstudiantes=0;
	    double promedioCurso=0;
	    int totalEstudiantes = estudiantes.size();
	    
		for(int i =0 ;i<estudiantes.size();i++) {
			elementoEstudiante = estudiantes.get(i);	
			promedioEstudiante = elementoEstudiante.calcularPromedioNotasEstudiante();
			sumaPromediosEstudiantes = sumaPromediosEstudiantes + promedioEstudiante;
		}
	    promedioCurso = sumaPromediosEstudiantes / totalEstudiantes;
	  
		return promedioCurso;
	}
	
	public void mostrar() {
		
		Estudiante elementoEstudiante=null;
		Nota elementoNota = null;
		for(int i =0 ; i<estudiantes.size();i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Estudiante [Nombre= "+elementoEstudiante.getNombre()+" Apellido= "+elementoEstudiante.getApellido()+" Cedula: "+elementoEstudiante.getCedula()+"]");
			
				for(int j= 0;j<elementoEstudiante.getNotas().size();j++) {
				elementoNota= elementoEstudiante.getNotas().get(j);
				
				System.out.println("Nota [Materia= "+elementoNota.getMateria().getNombre()+" Calificacion= "+elementoNota.getCalificacion()+"]");
				}
		}
		
	}
	
	
}

