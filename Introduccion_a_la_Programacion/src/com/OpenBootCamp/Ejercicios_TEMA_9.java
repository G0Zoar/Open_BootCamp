package com.OpenBootCamp;

public class Ejercicios_TEMA_9 {
    public static void main(String[] args) {
        ClienteX cliente = new ClienteX();
        cliente.setEdad(26);
        cliente.setNombre("Ezequiel!");
        cliente.setTelefono(1234567890);
        cliente.setCredito(10500);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
    }
}
// Clase Persona X
class PersonaX {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
// Clase Cliente X
class ClienteX extends PersonaX {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}
// Clase Trabajor X
class TrabajadorX extends PersonaX {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}
//ALUMNO: Ezequiel Troncoso.