package org.example;

public class Cliente extends Persona{
    private int NumAfiliado;
    private String RFC;

    public int getNumAfiliado() {
        return NumAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        NumAfiliado = numAfiliado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
