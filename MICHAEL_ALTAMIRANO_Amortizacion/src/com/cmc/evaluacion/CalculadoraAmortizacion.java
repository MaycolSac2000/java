package com.cmc.evaluacion;



public class CalculadoraAmortizacion {

	public static double calcularCuota (Prestamo prestamo){
		
		double valorInteres = (prestamo.getInteres()/100)/12;
		
		double numerador= (prestamo.getMonto()*valorInteres);
		double denominadorElevado = Math.pow((1+valorInteres),(-prestamo.getPlazo()));
		double denominador = 1-denominadorElevado;
		double cuota = numerador / denominador;
		
		
		return cuota;
	}
	
	public static void generarTabla(Prestamo prestamo) {
		
		double cuota = calcularCuota(prestamo);
		Cuota arregloCuota;
		double saldo= prestamo.getMonto();
	
		Cuota cu = new Cuota(1);
		cu.setCuota(cuota);
	    cu.setCapitalInicio(saldo);
	    calcularValoresCuota(prestamo, cu, null);
		
	
		for(int i=1 ;i<prestamo.getPlazo();i++) {
			
			
				cu = new Cuota(i+1);
				arregloCuota = prestamo.getCuotas().get(i-1);
				cu.setCuota(cuota);
			    cu.setCapitalInicio(arregloCuota.getSaldo());
				calcularValoresCuota(prestamo, cu, null);
			
				
						
			
			
			
			
		}
		
	}
	
	public static void calcularValoresCuota(Prestamo interesPrestamo, Cuota cuota,Cuota cuotaSiguiente ) {
		
		
		double interes = interesPrestamo.getPlazo()/12;
		double interesPorcentaje = interes /100;
		double interesTotal = cuota.getCapitalInicio()*interesPorcentaje;
		
		double capitalAbono = cuota.getCuota()-interesTotal;
		double saldoFinal = cuota.getCapitalInicio()-capitalAbono;
		cuota.setInteres(interesTotal);
		cuota.setAbonoCapital(capitalAbono);
		cuota.setSaldo(saldoFinal);
		interesPrestamo.getCuotas().add(cuota);
		
		
		
		
		
	}
	
	public static void mostrarTabla(Prestamo prestamo){
		
		Cuota elementoCuota = null;
		Utilitario util = new Utilitario();
		for(int i=0;i<prestamo.getCuotas().size();i++ ) {
			
			elementoCuota = prestamo.getCuotas().get(i);
			
			System.out.println((i+1)+"|"+util.redondear(elementoCuota.getCuota())+"|"+util.redondear(elementoCuota.getCapitalInicio())+"|"+util.redondear(elementoCuota.getInteres())+"|"+util.redondear(elementoCuota.getAbonoCapital())+"|"+util.redondear(elementoCuota.getSaldo()));
		}
	}

}
	
	

