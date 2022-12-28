package com.mycompany.donebymyself;

import java.util.Scanner;

/*Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: 
si introduzco "Fernando" me aparezca "Bievenido Fernando"*/
public class Reto3 {
    public static void main(String[] args) {
        Scanner miscanner = new Scanner (System.in);
        String nombre;
        System.out.println("Esribe tu nombre:");
        nombre = miscanner.nextLine();
        System.out.println("Bienvenido/a" + nombre);
    }
    
}
