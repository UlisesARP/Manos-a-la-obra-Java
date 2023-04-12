/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author ulise
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase, al final de ella, coloque un punto '.' ");
       String cadena = leer.nextLine();
       String retorno = codificacion(cadena); 
       System.out.println("El resultado luego de la codificación es: " + retorno);
        }
    public static String codificacion(String cadena){
    String PalabraCodificada = "";
    for (int i = 0; i < cadena.length(); i++) {
       char caracter = cadena.charAt(i);
        switch (cadena.charAt(i)) {
           case 'a':
           case 'A':
               PalabraCodificada= PalabraCodificada.concat("@");
                       break;
           case 'e':
           case 'E':
                  PalabraCodificada= PalabraCodificada.concat("#"); 
                       break;
           case 'i':
           case 'I':
                PalabraCodificada= PalabraCodificada.concat("$");
                       break;
           case 'o':
           case 'O':
                PalabraCodificada= PalabraCodificada.concat("%");
                       break;
           case 'u':
           case 'U':
                PalabraCodificada= PalabraCodificada.concat("*");
                       break;

           default:
               PalabraCodificada+= caracter;  
         }      
    }     
           return PalabraCodificada;
        }
   }
