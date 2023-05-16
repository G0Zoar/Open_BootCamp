package com.EjerciciosResueltos.EjercicioTEMA4;

public class SmartWatch extends SmartDevice{
    double peso;
    String sO;

    public SmartWatch() {

    }

    public SmartWatch(double peso, String sO) {
        this.peso = peso;
        this.sO = sO;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "peso=" + peso +
                ", sO='" + sO + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
