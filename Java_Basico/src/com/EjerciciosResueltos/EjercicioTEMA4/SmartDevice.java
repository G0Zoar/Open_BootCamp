package com.EjerciciosResueltos.EjercicioTEMA4;

public class SmartDevice {
    String marca;
    String modelo;
    int year;
    String color;
    String sistemaOperativo;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, int year, String color, String sistemaOperativo){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}



