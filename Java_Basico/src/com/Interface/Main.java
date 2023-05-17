package com.Interface;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado ezequiel = new Empleado("Ezequiel", 26, 75000, true);
        Empleado fernando = new Empleado("Fernando", 24, 75000, true);
        Empleado ruben = new Empleado("Ruben", 29, 75000, true);

        empleadoCRUD.guardar(ezequiel);
        empleadoCRUD.guardar(fernando);
        empleadoCRUD.guardar(ruben);

    }
}
