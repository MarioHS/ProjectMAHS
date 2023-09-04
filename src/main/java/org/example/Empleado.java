package org.example;

public class Empleado extends Persona{
    private int NumEmpleado;
    private String Horario;
    private double Salario;

    public int getNumEmpleado() {
        return NumEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        NumEmpleado = numEmpleado;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
