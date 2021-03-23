package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Ingrese numero [1-7] : ");
		  int nd = sc.nextInt();
		  
		  String nombre_dia = "";
		  
		  switch (nd) {
		      case 1:
		    	  nombre_dia = "lunes";
		    	  break;
		      case 2:
		    	  nombre_dia = "martes";
		    	  break;
		      case 3:
		    	  nombre_dia = "miercoles";
		    	  break;
		      case 4:
		    	  nombre_dia = "jueves";
		    	  break;
		      case 5:
		    	  nombre_dia = "viernes";
		    	  break;
		      case 6:
		    	  nombre_dia = "sabado";
		    	  break;
		      case 7:
		    	  nombre_dia = "domingo";
		    	  break;
		      default:
		        nombre_dia = "desconocido";   	    
		  } // ALT +125
		  
		  System.out.println("\n----R E S U L T A D O S ------");
		  System.out.println("Dia de la semana : " + nombre_dia.toUpperCase());
	

	}

}
