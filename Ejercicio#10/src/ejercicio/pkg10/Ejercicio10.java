/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entre 1 y 20");
           int cont = leer.nextInt();
            do {
            }while (cont < 0 || cont > 20);
            System.out.print(cont);
            for (int j = 0; j < cont; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
   }
    
    }
    

