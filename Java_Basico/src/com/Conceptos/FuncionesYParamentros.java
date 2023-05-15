package com.Conceptos;

public class FuncionesYParamentros {
    public static void main(String[] args) {

        // holaMundo();
        // holaMundo("Ezequiel");
        // holaMundo("Fernando");
        // holaMundo("Troncoso");
        String hola = devolverHolaMundo();
        System.out.println(hola);


    }

    public static void holaMundo() {
        System.out.println("Hola Mundo!");
        System.out.println("Hola Mundo!");
    }

    private static void holaMundo(String name ) {
        System.out.println("Hola " + name);
    }

    private static String devolverHolaMundo() {
        return "Devuelve Texto!";
    }



}
