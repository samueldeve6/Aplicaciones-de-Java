/**
 * 
 */
package com.miproyecto.numeroprimo;
import java.util.Scanner;
/**
 * 
 */
public class NumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		boolean esPrimo=true;
		int i=0;
		Scanner entrada = new  Scanner(System.in);
		System.out.println("Ingrese un numero para evaluar si es primo");
		
		numero = entrada.nextInt();
		System.out.println(numero);	
		
		
		if (numero <= 1) {
	            esPrimo = false; // 0, 1 y negativos no son primos
	    } else {
		for (i=2;i<numero;i++) {
			
			if(numero % i == 0) {
				esPrimo = false;
				break;
			}
		}
	    }
		if(esPrimo == true) {
			System.out.println("SI es primo");
		}else {
			System.out.println("NO es primo");
			
		}
	

	}

}