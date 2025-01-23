/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese el pais,"
                        + " siempre en mayuscula la primera letra:");
                String valor1 = entrada.nextLine();// se espera un nombre de pais
                char inicial = valor1.charAt(0);
                if (inicial == 'A' || inicial == 'E' || inicial == 'I' || inicial
                        == 'O' || inicial == 'U') {
                    bandera = true;
                    throw new Exception("Pais con vocal");

                } else {

                    cadena = valor1;
                    bandera = false;

                }
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);

            }

        }

    }

}
