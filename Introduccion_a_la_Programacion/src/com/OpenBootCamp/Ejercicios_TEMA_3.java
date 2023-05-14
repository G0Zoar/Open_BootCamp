package com.OpenBootCamp;

public class Ejercicios_TEMA_3 {
    public static void main(String[] args) {
        System.out.println("Introducción a la Programación!");

        //Ejercicios TEMA 3 'Primera Parte'

        int a = 10;
        int b = 20;
        int c = 30;
        var resultado = suma(a, b, c);
        System.out.println(resultado);

        //Ejercicios TEMA 3 'Segunda Parte'

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);

    }

    //Ejercicios TEMA 3 'Primera Parte'

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    //Ejercicios TEMA 3 'Segunda Parte'
    static class Coche {
        int puertas = 2;
        void SumarPuertas() {
            this.puertas++;
        }
    }
}
// ALUMNO: Ezequiel Troncoso !