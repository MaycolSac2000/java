package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante() {
		notas = new ArrayList<Nota>();
	}

	public Estudiante(String nombre, String apellido, String cedula) {
		notas = new ArrayList<Nota>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;

	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void agregarNota(Nota nuevaNota) {

		Nota elementoNota = null;
		boolean notaVerificada = false;

		if (notas.size() == 0) {
			if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {

				notaVerificada = true;
			} else {
				System.out.println("Nota de la materia: " + nuevaNota.getMateria().getNombre()
						+ "No tiene una nota valida" + "No se la pudo agregar");
			}
		} else {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {

					System.out.println(
							"El codigo de materia " + elementoNota.getMateria().getNombre() + " esta repetido");
					break;
				} else {
					if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
						notaVerificada = true;
					} else {
						System.out.println("Nota de la materia: " + elementoNota.getMateria().getNombre()
								+ "No tiene una nota valida");
					}
				}

			}

		}
		
		if(notaVerificada) {
			notas.add(nuevaNota);
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {

		Nota elementoNota = null;

		for (int i = 0; i < notas.size(); i++) {

			elementoNota = notas.get(i);

			if (elementoNota.getMateria().getCodigo().equals(codigo)) {
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					elementoNota.setCalificacion(nuevaNota);
				} else {
					System.out.println("La nota es invalida");
				}

			} 

		}

	}

	public double calcularPromedioNotasEstudiante() {

		Nota elementoNota = null;
		double promedio = 0;
		double sumaPromedio = 0;
		int materias = notas.size();
		;

		for (int i = 0; i < notas.size(); i++) {

			elementoNota = notas.get(i);

			sumaPromedio = sumaPromedio + elementoNota.getCalificacion();

		}
		promedio = sumaPromedio / materias;
		return promedio;
	}

	public void mostrar() {

		System.out.println(
				"Estudiante [Nombre=" + getNombre() + "Apellido=" + getApellido() + "Cedula: " + getCedula() + "]");
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			System.out.println("Notas [Materia= " + elementoNota.getMateria().getNombre() + "Calificacion= "
					+ elementoNota.getCalificacion() + "]");

		}

	}

}
