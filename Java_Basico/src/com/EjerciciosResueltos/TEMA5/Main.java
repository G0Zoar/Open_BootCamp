package com.EjerciciosResueltos.TEMA5;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save(new CocheCRUDImpl());
        cocheCRUD.Delete(new CocheCRUDImpl());


    }
}
// ALUMNO: Ezequiel Troncoso .
