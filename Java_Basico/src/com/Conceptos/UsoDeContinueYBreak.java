package com.Conceptos;

public class UsoDeContinueYBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i + " Hola Fer!");

        }
        System.out.println("finished");

        int j = 0;
        while (j < 10) {
            j++;
            if (j == 3) {
                break;
            }
            System.out.println(i + " Break!");
        }
    }
}
