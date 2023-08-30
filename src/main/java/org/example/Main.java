package org.example;

import javax.swing.*;
import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo();
        tiempo.setHoras(5);
        tiempo.setMinutos(34);
        tiempo.setSegundos(27);

        JOptionPane.showMessageDialog(null, tiempo.toString());

        }
    }