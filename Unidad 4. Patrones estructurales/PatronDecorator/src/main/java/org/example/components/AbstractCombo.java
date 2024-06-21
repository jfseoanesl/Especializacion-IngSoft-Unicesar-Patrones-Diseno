package org.example.components;

public abstract class AbstractCombo {

    private String descripcion;


    public AbstractCombo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double getPrecio();
}
