/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Al principio de cada "sout" indicamos el tipo de la variable que estamos ingresando por teclado
        System.out.println("Variable Boolean");
    boolean SiNo = leer.nextBoolean();
    //En el segundo, cada "sout" nos muestra el valor guardado en esa variable
        System.out.println("Es: " + SiNo ) ;
        System.out.println("Variable double (decimal)");
    double decimal = leer.nextDouble();
     System.out.println("Es: " + decimal ) ;
      System.out.println("Variable char");
    char a = leer.next().charAt(0);
     System.out.println("Es: " + a ) ;
     /* cabe recalcar, que hay que ingresar por teclado valores que puedan ser guardados en las variables segun su tipo
     Si tenemos una variable boolean ( verdadero/falso ) debemos ingresar True/False por teclado, de otra manera
     dará error
     */
    }

}
