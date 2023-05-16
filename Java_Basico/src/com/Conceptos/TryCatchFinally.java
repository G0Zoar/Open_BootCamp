package com.Conceptos;

public class TryCatchFinally {

    public static void main(String[] args) {


        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Finished");

    }

}
