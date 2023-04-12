/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13_14;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[]Equipo = new String [5];
        for (int i = 0; i < 5; i++) {
            Equipo[i]= leer.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Equipo[i]);
        }
}
   }
