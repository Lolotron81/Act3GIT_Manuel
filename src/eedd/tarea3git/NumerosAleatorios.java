package eedd.tarea3git;

import java.util.Scanner;

public class NumerosAleatorios {
  
  public static final int COMIENZO_INTERVALO = 1;
  public static final int FIN_INTERVALO = 15;
  public static final int CANTIDAD_NUMEROS_ALEATORIOS = 20;

	public static void main(String[] args) {
		
		// nombre del programa
	  System.out.println("NÚMEROS ALEATORIOS ENTRE 1 Y 10");
	  
	  int numeroAleatorio = 0;
	  
	  for (int i = COMIENZO_INTERVALO; i <= CANTIDAD_NUMEROS_ALEATORIOS; i++) {
	    numeroAleatorio = (int)(Math.random() * FIN_INTERVALO);
	    if (numeroAleatorio >= 1 && numeroAleatorio <= 100) {
	      System.out.println("numero aleatorio " + i + ": " + numeroAleatorio);
	    }
	  }
	}

}
