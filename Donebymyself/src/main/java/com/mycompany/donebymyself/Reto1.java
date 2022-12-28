package com.mycompany.donebymyself;

import java.text.DecimalFormat;

/* Declara dos variables numéricas (con el valor que desees), muestra por consola la 
suma, resta, multiplicación, división y módulo (resto de la división)*/
public class Reto1 {
    public static void main(String[] args) {
        DecimalFormat formateador = new DecimalFormat ("##.##");
        int a=55, b= 67;
        double c = (a = a), d = (b=b); 
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + formateador.format(c/d));
        System.out.println("El resto de la division es: " + formateador.format(c%d));
    }
}
