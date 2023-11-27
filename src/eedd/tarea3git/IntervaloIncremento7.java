package eedd.tarea3git;

import java.util.Scanner;

public class IntervaloIncremento7 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int numero1;
    int numero2;
 
    do {
      System.out.print("Introduce el primer número: ");
      numero1 = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el segundo número (distinto al primero): ");
      numero2 = Integer.parseInt(sc.nextLine());
    } while (numero1 == numero2 || numero2 < numero1);
    
    System.out.print("Introduce el tercer número: ");
    int numero3 = Integer.parseInt(sc.nextLine());
    
    for (int i = numero1; i <= numero2; i += 7) {
      if (i != numero3) {
        System.out.println(i);
      } else {
        System.out.println(numero3);
      }
    }
    
    if (numero3 >= numero1 && numero3 <= numero2) {
      System.out.println(numero3);
    }

    sc.close();
  }
}
