package com.Conceptos;

public class SentenciasIfElse {
    public static void main(String[] args) {

        boolean condicion1 = 999 < 7;

        if (condicion1) {
            System.out.println("Es Verdadero!");
        } else {
            System.out.println("Es Falso!");
        }

        int number1 = 90;
        int number2 = 10;
        int number3 = 20;
        int number4 = 50;

        if (number1 < number2 && number2 < number3) {
            System.out.println("Se cumple la condicion propuesta!");
        } else if (number3 < number4) {
            System.out.println("Se cumple");
        } else {
            System.out.println("No se cumple");
        }

        int edad1 = 16;
        int edad2 = 21;

        if (edad1 >= edad2) {
            System.out.println("Verifica la condicion");
        }
        System.out.println("Incumple la condicion");
    }
}
