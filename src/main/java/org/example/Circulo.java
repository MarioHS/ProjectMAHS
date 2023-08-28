package org.example;

public class Circulo extends Forma{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double Area;
        Area=(3.14159*(Math.pow(radio, 2)));
        return Area;
    }
}
