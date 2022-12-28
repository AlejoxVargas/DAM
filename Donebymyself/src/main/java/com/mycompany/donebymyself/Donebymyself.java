package com.mycompany.donebymyself;

import java.text.DecimalFormat;

public class Donebymyself {

    // Ejercicio propuesto 4.2.2: Crea un programa que muestre el resto de dividir 100 entre 30 
    public static void main(String[] args) {
        DecimalFormat formateador = new DecimalFormat(".##");
        double division, a = 100, b = 30;
        division = a/b;
        System.out.println("El resto de dividir 100 entre 30 es: " + formateador.format(a/b));
    
    }
}
