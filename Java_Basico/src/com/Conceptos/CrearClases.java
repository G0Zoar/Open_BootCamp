package com.Conceptos;

public class CrearClases {
}

class Coche {
    // Atributos
    String color;
    String fabricante;
    String modelo;
    double peso;
    double largo;
    Integer velocidad = 0;

    // Constructores
    public Coche(String color, String fabricante, String modelo, double peso, double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // Comportamiento
    public void acelerar(Integer cantidad) {
      if (cantidad > 0 && cantidad <= 120) {
          this.velocidad = this.velocidad + cantidad;
      }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}