package com.mycompany.donebymyself;

import java.util.Scanner;

/*
Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
Por ejemplo: si introduzco un 97, me muestre una a.
*/

public class Reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Numero: ");
        int numero = sc.nextInt();
        char caracter1 =(char)numero;
        System.out.println(caracter1);
    }
}
