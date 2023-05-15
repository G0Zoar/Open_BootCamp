package com.Conceptos;

public class CrearObjetos {
    public static void main(String[] args) {

        String coche = "Alfa Romeo";
        Coche cocheObj = new Coche("Red","Alfa Romeo","Mito",1463.68,5.43);

        cocheObj.acelerar(50);

        System.out.println(cocheObj);

        cocheObj.peso = 1200.5;

        System.out.println(cocheObj);

    }
}
