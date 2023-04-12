/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        Esmulti(num1,num2);
    }  
     public static void Esmulti(int num1, int num2){
if (num1%num2 == 0){
System.out.println("El número " + num1 + " es multiplo de "+ num2);
} else {
System.out.println("El número " + num1 + " no es multiplo de "+ num2);
}
}
   }
