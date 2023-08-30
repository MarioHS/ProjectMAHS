package org.example;

public class Tiempo {
    private int horas, minutos, segundos;

    public int getHoras(int i) {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos(int i) {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos(int i) {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return this.horas + "h " +  this.minutos + "m " + this.segundos + "s ";
    }
}
