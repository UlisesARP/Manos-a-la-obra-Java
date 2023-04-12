/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        byte num1 = leer.nextByte();
        System.out.println("Ingrese el segundo número");
         byte num2 = leer.nextByte();
         if (num1 > 25 && num2 > 25){
             System.out.println("Ambos numeros ingresados son mayores a 25");
             }else if (num1 > 25 || num2 > 25 ) {
                 System.out.println("Al menos uno de los numeros ingresados, es mayor a 25 ");
             } else { 
                 System.out.println("Ninguno de los numeros ingresados es mayor a 25");
             }
         }
    }
