package org.example;

import javax.swing.*;
import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setRadio(2.57);

        Rectángulo rectángulo = new Rectángulo();
        rectángulo.setLado1(13);
        rectángulo.setLado2(6);

        //Mensaje de prueba

        JOptionPane.showMessageDialog(null,"El area del circulo es: " + circulo.calcularArea() +
                "\n y del rectangulo es: " + rectángulo.calcularArea());
        }
    }