/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author utpl
 */
public class ejempo12_ {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();

        int [] resultados = new int[valor];

        try {
            for (int i = 0; i < resultados.length; i++) {
                System.out.println("Ingrese el numerador");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese el denominador");
                int valor2 = entrada.nextInt();

                int div = valor1 / valor2;
                resultados[i] = div;

            }
            
        } catch (ArithmeticException e) {
            System.out.println("(ArithmeticException) Ocurrio una excepcion" 
                    + "de tipo " + e);
        }
        
        } catch (InputMismatchException e) {
            System.out.println("(InputMismatchException) Ocurrio una excepcion"
                    + " de tipo " + e);
        }
        
         } catch (Exception e) {
            System.out.println(" Ocurrio una excepcion" + e);
        }

        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
  






