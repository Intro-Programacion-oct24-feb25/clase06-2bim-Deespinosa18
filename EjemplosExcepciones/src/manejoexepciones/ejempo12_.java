/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ejempo12_ {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        double div=0;
        int [] resultados = new int[valor];
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Ingrese el numerador");
            double valor1 = entrada.nextDouble();
            System.out.println("Ingrese el denominador");
            double valor2 = entrada.nextDouble();
            
            div= valor1/valor2;
            
            
       }
        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
    }
}  

