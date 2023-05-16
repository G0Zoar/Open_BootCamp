package com.Conceptos;

import java.util.Scanner;

public class IOEstandar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un Numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es:" + " " + nombre);
        System.out.println("El numero introducido es:" + " " + numero);

        System.out.println("Fin del Programa");

    }
}
