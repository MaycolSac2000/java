package com.krakedev.evaluacion;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;




public class Directorio {

	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
		this.fechaModificacion = new Date();
	}
	
	public boolean agregarContacto(Contacto cont) {
		if(cont != null && buscarPorCedula(cont.getCedula()) == null) {
			
			contactos.add(cont);
			return true;
		}else {
			return false;
		}
	}
	
	
	public Contacto buscarPorCedula(String cedulaContacto){
		
		Contacto elementoContacto = null;
		Contacto contactoEncontrado = null;
		for(int i=0;i<contactos.size();i++) {
			elementoContacto = contactos.get(i);
			if(elementoContacto.getCedula().equals(cedulaContacto)) {
				contactoEncontrado = elementoContacto;
			}
		}
		
		if(contactoEncontrado!= null) {
			return contactoEncontrado;
		}else {
			return contactoEncontrado;
		}
		
		
	}
	
	public String consultarUltimaModificacion() {
		
		SimpleDateFormat ultimaModificacion  = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		
		String fechAFormateada = ultimaModificacion.format(fechaModificacion);
		
		return fechAFormateada;
	}
	
	public int contarPerdidos(){
		
		int contactosPerdidos =0;
		Contacto elementoContacto = null;
		for (int i =0 ;i<contactos.size();i++) {
			elementoContacto = contactos.get(i);
			if(elementoContacto.getDireccion() == null){
				contactosPerdidos = contactosPerdidos+1; 
			}
		}
		return contactosPerdidos;
		
	}
	
	public int contarFijos(){
		
		int contactosFijos =0;
		ArrayList<Telefono> elementoTelefono = new ArrayList<Telefono>();
		Contacto elementoContacto = null;
		Telefono telefonosFijos = null;
		for (int i =0 ;i<contactos.size();i++) {
			elementoContacto = contactos.get(i);
			elementoTelefono = elementoContacto.getTelefonos();
			for(int j = 0 ; j<elementoTelefono.size();j++) {
				telefonosFijos = elementoTelefono.get(j);
				if(telefonosFijos.getTipo().equalsIgnoreCase("Convencional")&&telefonosFijos.getEstado().equalsIgnoreCase("C")){
					contactosFijos = contactosFijos+1; 
				}
			}
			
		}
		return contactosFijos;
		
	}
	
	public void depurar() {
		
		Contacto elementoContacto = null;
		for (int i =0 ;i<contactos.size();i++) {
			elementoContacto = contactos.get(i);
			if(elementoContacto.getDireccion() == null){
				incorrectos.add(elementoContacto); 
			}else {
				correctos.add(elementoContacto); 
			}
		}
		contactos.clear();
		
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
}
