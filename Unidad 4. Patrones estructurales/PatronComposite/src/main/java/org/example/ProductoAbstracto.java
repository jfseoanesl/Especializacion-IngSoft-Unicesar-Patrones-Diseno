package org.example;

public abstract class ProductoAbstracto {
    protected String nombre;
    protected double precio;



    public ProductoAbstracto() {
    }

    public abstract String getDatosProducto();
    public abstract double getPrecioFinal();

}
