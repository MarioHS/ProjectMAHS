package org.example;

import javax.swing.*;
import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo();
        tiempo.setHoras(10);
        tiempo.setMinutos(10);
        tiempo.setSegundos(10);
        Tiempo tiempo2 = new Tiempo();
        tiempo.setHoras(11);
        tiempo.setMinutos(11);
        tiempo.setSegundos(11);

        System.out.printf("la suma:" + Tiempo.sumartiempo(tiempo, tiempo2).toString());






        JOptionPane.showMessageDialog(null, tiempo.toString());

        }
    }