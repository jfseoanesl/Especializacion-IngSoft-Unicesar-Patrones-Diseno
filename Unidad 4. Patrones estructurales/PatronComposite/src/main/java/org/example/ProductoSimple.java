package org.example;

public class ProductoSimple extends ProductoAbstracto{
    private String marca;

    public ProductoSimple(String nombre, double precio, String marca) {
        this.nombre=nombre;
        this.precio=precio;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public  String getDatosProducto(){
        return "\tProductoSimple{" +
                "nombre=" + this.getNombre() + ',' +
                "marca=" + marca + ',' +
                "precio=" + this.getPrecio()  +
                '}';
    }

    @Override
    public double getPrecioFinal() {
        return this.getPrecio();
    }
}
