package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto extends ProductoAbstracto{

    private List<ProductoAbstracto> productos = new ArrayList<>();

    public ProductoCompuesto(String nombre) {
      this.nombre=nombre;
    }

    public void addProducto(ProductoAbstracto producto){

        this.productos.add(producto);

    }

    public void removeProducto(ProductoAbstracto producto){

        this.productos.remove(producto);

    }

    @Override
    public String getDatosProducto() {
        StringBuilder detalles = new StringBuilder();

        for (ProductoAbstracto p: this.productos){
            detalles.append(p.getDatosProducto()).append("\n");
        }

        return "\tProductoCompuesto{\n" +
                "\tnombre=" + nombre +"\n"+
                "\tprecio=" + this.getPrecioFinal() +"\n"+
                "\tproductos=\n" + detalles.toString() +"\n"+
                '}';
    }

    @Override
    public double getPrecioFinal() {

        double precioTotal=0;
        for(ProductoAbstracto p: this.productos){
            precioTotal+=p.getPrecioFinal();
        }
        return precioTotal;
    }
}
