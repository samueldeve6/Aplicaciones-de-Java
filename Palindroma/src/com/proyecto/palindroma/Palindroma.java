package com.proyecto.palindroma;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		
		String cadena = entrada.nextLine();
		
		Palabrapalindroma(cadena);

	}
	
	public static void Palabrapalindroma(String palabra) {
		String palabraID="", palabraDI="";
		
		for (int i =0; i<palabra.length();i++) {
			palabraID += palabra.charAt(i);
		}
		
		for (int i = palabra.length()-1;i>=0;i--){
			palabraDI += palabra.charAt(i);
		}
		
		if(palabraID.equals(palabraDI)) {
			System.out.println("La palabra SI es palindroma");
		}else {
			System.out.println("La palabra NO es palindroma");
		}

	}

}
