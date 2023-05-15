package com.Conceptos;

public class SobrecargaDeFunciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Ezequiel");
        holaMundo(26);

    }

    /* Funcion Sobrecargada

    public static void holaMundo() {
        System.out.println("Hola Mundo!");
        System.out.println("Hola Mundo!");
    }

    private static void holaMundo(String name ) {
        System.out.println("Hola " + name);
    }

     */

    /* Funcion Duplicada

    public static void holaMundo() {
        System.out.println("Hola Mundo!");
        System.out.println("Hola Mundo!");
    }

    private static void holaMundo() {
        System.out.println("Hola " + name);
    }

     */

    public static void holaMundo() {
        System.out.println("Hola Mundo!");
        System.out.println("Hola Mundo!");
    }
    public static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }
    public static void holaMundo(int number) {
        System.out.println("Numero " + number);
    }

}
