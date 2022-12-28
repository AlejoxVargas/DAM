package com.mycompany.donebymyself;

import java.util.Scanner;

/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.*/
public class Reto5 {
    public static void main(String[] args) {
        Scanner miscanner = new Scanner (System.in);
        System.out.println("Escriba Numero: ");
        int numero = miscanner.nextInt();
        if (numero%2==0) {
            System.out.println(numero + " es divisible entre 2");
        }
        else {
            System.out.println(numero + " no es divisible entre 2");
        } 
    }
}
