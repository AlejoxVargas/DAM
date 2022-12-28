package com.mycompany.donebymyself;

import java.util.Scanner;

/*
8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Reto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca caracter en ASCII: ");
        char char1 = sc.next().charAt(0);

        System.out.println("Caracter en ASCII es: " + introducirChar.convertirCharInt(char1));

        // introducirChar.convertirCharVoid(char1);
    }

    class introducirChar {

        public static int convertirCharInt(char caracter1) {
            int caracterAscii = (int) caracter1;
            return caracterAscii;
        }

        /*public static void convertirCharVoid(char caracter1) {
            int caracterAscii = (int) caracter1;
            System.out.println("Caracter en ASCII es: " + caracterAscii);
        }*/
    }

}
