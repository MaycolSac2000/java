package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono tel) {
	
		if(tel.getOperadora() == "movi") {
			tel.setTieneWhatsapp(true);
		}
		
	}
	
	public int contarMovi(Telefono tel1,Telefono tel2,Telefono tel3) {
		
		int totalMovi=0;
		if(tel1.getOperadora() == "movi") {
			totalMovi=totalMovi +1 ;	
		}
		
		if(tel2.getOperadora() == "movi") {
			totalMovi=totalMovi +1 ;	
		}
		if(tel3.getOperadora() == "movi") {
			totalMovi=totalMovi +1 ;
		}
		
		
		return totalMovi;
		
	}
	
public int contarClaro(Telefono tel1,Telefono tel2,Telefono tel3,Telefono telf4) {
		
		int totalClaro=0;
		if(tel1.getOperadora() == "claro") {
			totalClaro=totalClaro +1 ;	
		}
		
		if(tel2.getOperadora() == "claro") {
			totalClaro=totalClaro +1 ;	
		}
		if(tel3.getOperadora() == "claro") {
			totalClaro=totalClaro +1 ;
		}
		if(telf4.getOperadora() == "claro") {
			totalClaro=totalClaro +1 ;
		}
		
		
		return totalClaro;
		
	}


}
