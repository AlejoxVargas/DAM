package com.mycompany.donebymyself;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Haz una aplicación que calcule el área de un circulo (pi*r^2). El radio se pedirá por teclado (recuerda pasar de String 
a double con Double.parseDouble). Usa la constante PI y el metodo pow de math*/

public class Reto4 {
    public static void main(String[] args) {
        Scanner miscanner = new Scanner (System.in);
        DecimalFormat Formato = new DecimalFormat ("##.#");
        final double pi=3.1416; 
        double area; 
        String radio; 
        System.out.println("Radio del circulo: ");
        radio = miscanner.nextLine();
        double radioD = Double.parseDouble(radio);
        area = pi*(Math.pow(radioD, 2));
        System.out.println("El area del circulo es: " + Formato.format(area) + " metros");
    }
}
