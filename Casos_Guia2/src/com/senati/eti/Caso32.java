package com.senati.eti;

import java.util.Scanner;


public class Caso32 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese numero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese numero 3: ");
		int n3 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2 && n1 == n3)
			mensaje = "Los numeros son iguales";
		else if (n1 > n2 && n1 > n3)
			mensaje = " El primer numero " +  n1 + " es mayor";
		else if  (n2 > n1 && n2 > n3)
			mensaje = " El segundo numero " + n2 + " es mayor";
		else
			mensaje = " El tercer numero " + n3 + " es mayor";
		
		System.out.println("\n----R E S U L T A D O S ------");
		System.out.println("Mensaje:  " + mensaje);
	

	}

}
