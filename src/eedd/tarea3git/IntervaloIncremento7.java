package eedd.tarea3git;

import java.util.Scanner;

public class IntervaloIncremento7 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Solicitar y validar el segundo número (debe ser distinto al primero)
    int numero1;
    int numero2;
    do {
      // Solicitar y validar el primer número
      System.out.print("Introduce el primer número: ");
      numero1 = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el segundo número (distinto al primero): ");
      numero2 = Integer.parseInt(sc.nextLine());
    } while (numero1 == numero2 || numero2 < numero1);
    
    for (int i = numero1; i <= numero2; i += 7) {
      System.out.println(i);
    }

    sc.close();
  }
}
