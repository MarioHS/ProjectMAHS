package org.example;

public class Manager extends Persona{
    private int NumEmpleado;
    private String RFC;

    public int getNumEmpleado() {
        return NumEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        NumEmpleado = numEmpleado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
