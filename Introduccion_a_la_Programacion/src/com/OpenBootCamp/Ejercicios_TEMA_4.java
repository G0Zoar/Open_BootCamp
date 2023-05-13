package com.OpenBootCamp;

public class Ejercicios_TEMA_4 {
    public static void main(String[] args) {

        // Estructura de Control!

        //Ejercicio 1 Condicionales
        System.out.println("Introducción a la Programación");
        int numeroIf = 10;
        if (numeroIf > 0) {
            System.out.println("Es Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es Negativo");
        } else {
            System.out.println("0");
        }

        //Ejercicio 2 While
        var numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Ejercicio 3 Do While
        var numeroWhileDo = 3;
        do {
            System.out.println(numeroWhileDo);
            numeroWhileDo++;
        } while (numeroWhileDo < 3);

        //Ejercicio 4 For
        var numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Ejercicio 5 Switch
        var estacion = "Helado";
        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
                default:
                    System.out.println("Esto no es una Estacion");
        }
    }
}
//Alumno: Fernando Ezequiel Troncoso.