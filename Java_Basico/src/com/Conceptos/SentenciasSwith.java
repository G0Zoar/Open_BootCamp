package com.Conceptos;

public class SentenciasSwith {
    public static void main(String[] args) {

        String Estacion = "Helado y Cafe";

        switch (Estacion) {
            case "Verano":
                System.out.println("Estamos en Verano!");
                break;

            case "Otoño":
                System.out.println("Estamos en Otoño!");
                break;

            case "Invierno":
                System.out.println("Estamos en Invierno!");
                break;

            case "Primavera":
                System.out.println("Estamos en Primavera!");
                break;

            default:
                System.out.println("Esto no es una estacion!");
        }

    }
}
