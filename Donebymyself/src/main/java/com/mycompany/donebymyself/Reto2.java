package com.mycompany.donebymyself;

import java.util.Scanner;

/*Declara 2 variables numéricas (con el valor que desees), 
he indica cual es mayor de los dos. Si son iguales indicarlo también. 
Ves cambiando los valores para comprobar que funciona.*/

public class Reto2 {
    public static void main(String[] args) {
        Scanner miscaner = new Scanner(System.in);
        long valor1, valor2;
        System.out.println("Ingrese primer valor: ");
        valor1 = miscaner.nextLong();
        System.out.println("Ingrese segundo valor: ");
        valor2 = miscaner.nextLong();
        
        if (valor1>valor2)
        {
            System.out.println(valor1 + " es mayor que " + valor2);
        }
        if (valor2>valor1)
        {
            System.out.println(valor2 + " es mayor que " + valor1);
        }
        if (valor1==valor2) 
        {
            System.out.println(valor1 + " es igual a " + valor2);
        }
    }
}
