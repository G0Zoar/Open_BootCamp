package com.EjerciciosResueltos.EjercicioTEMA4;

public class SmartPhone extends SmartDevice{
    String pantalla;
    int memoriaRamGB;

    public SmartPhone(){

    }

    public SmartPhone(String pantalla, int memoriaRamGB){
        this.pantalla = pantalla;
        this.memoriaRamGB = memoriaRamGB;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", memoriaRamGB=" + memoriaRamGB +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
