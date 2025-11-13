package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
	
		//Objeto1
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		//Objeto2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		//Objeto3
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		//Objeto4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		
		Cuenta cuenta6 = new Cuenta("0666");
		
		
		
		//Impprimir cuentas
		System.out.println("--------------ValoresIniciales----------------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("--------------ValoresModificados----------------");
		//Modifico las cuentas 1,2,3
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		//Imprimo con los nuevos cambios
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		//Imprimir las cuentas 4,5,6 
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
		
		
		

	}

}
