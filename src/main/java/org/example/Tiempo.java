package org.example;

public class Tiempo {
    private int horas, minutos, segundos;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return this.horas + "h " +  this.minutos + "m " + this.segundos + "s ";
    }

    public static Tiempo sumartiempo(Tiempo tiempo1, Tiempo tiempo2){
        Tiempo tiempor = new Tiempo();

        tiempor.setHoras(tiempo1.getHoras()+tiempo2.getHoras());
        tiempor.setMinutos(tiempo1.getMinutos() + tiempo2.getMinutos());

        tiempor.setSegundos(tiempo1.getSegundos() + tiempo2.getSegundos());
        //Sumar los segundos y dividirlos entre sesenta, el resultante convertirlo en entero y

        return tiempo1;
    }
}
