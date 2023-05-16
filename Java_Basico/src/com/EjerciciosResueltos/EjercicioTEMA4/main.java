package com.EjerciciosResueltos.EjercicioTEMA4;

public class main {
    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        SmartDevice smartDevice1 = new SmartDevice("Samsung", "J7", 2016, "Negro", "Android");
        smartDevice1.marca = "Samsung";
        System.out.println(smartDevice1);

        smartPhone = new SmartPhone("Tactil", 2);
        smartPhone.color = "Gris";
        System.out.println(smartPhone);

        smartWatch = new SmartWatch(500.3d, "Android");
        smartWatch.marca = "Philips";
        System.out.println(smartWatch.marca);

    }
}
