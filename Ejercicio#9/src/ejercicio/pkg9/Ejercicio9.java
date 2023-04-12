/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num;
        int suma = 0;
        int counter=0;
        do {
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        counter++;
        if (num > 0){
       suma = num+suma;}
        } while (num != 0 && counter < 20 );
        System.out.println("La suma de todos los numeros ingresados es " + suma);
       }
     }
    
