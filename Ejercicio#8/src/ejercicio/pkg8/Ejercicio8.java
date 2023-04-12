/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota para su validación");
      byte nota = leer.nextByte();
      while ( nota < 0 || nota > 10) {
        System.out.println("Nota fuera de los parametros, ingrese la nota nuevamente");
        nota = leer.nextByte();
    }

        }

     }
