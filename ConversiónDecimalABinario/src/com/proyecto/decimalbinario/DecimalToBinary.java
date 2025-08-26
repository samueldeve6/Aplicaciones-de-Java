package com.proyecto.decimalbinario;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese un numero decimal");
		int decimal = entrada.nextInt();
		int residuo;
		String binario="";
		
		 while(decimal>0) {
			residuo= decimal%2;
			binario = residuo+binario;
			decimal = decimal/2;
			
		}
		System.out.println("Numero en Binario: "+binario);
		
		
		
		
		
		
	}

}
