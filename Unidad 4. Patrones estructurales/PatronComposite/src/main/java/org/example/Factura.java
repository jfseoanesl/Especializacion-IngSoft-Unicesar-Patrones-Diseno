package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int counterFactura = 0;
    private int ordenId;
    private String cliente;
    private List<ProductoAbstracto> itemsFactura = new ArrayList<>();

    public Factura(String cliente) {
        this();
        this.cliente=cliente;
    }

    public Factura() {
        counterFactura++;
        this.ordenId = counterFactura;
    }

    public void addItemFactura(ProductoAbstracto producto){
        this.itemsFactura.add(producto);
    }

    public void deleteItemFactura(ProductoAbstracto producto) {
       this.itemsFactura.remove(producto);
    }

    public String getInfoFactura(){

        StringBuilder itemsFacturaInfo = new StringBuilder();
        for(ProductoAbstracto p: this.itemsFactura){
            itemsFacturaInfo.append(p.datosProducto()).append("\n");
        }

        return "Factura{\n\n" +
                "ordenId=" + ordenId + '\n' +
                "cliente='" + cliente + '\n' +
                "precio='" + this.getPrecio()+ '\n' +
                "itemsFactura=\n" + itemsFacturaInfo.toString() +
                '}';

    }

    public double getPrecio() {
        double precio=0;
        for(ProductoAbstracto p: this.itemsFactura){
            precio+=p.getPrecioFinal();
        }
        return precio;
    }
}
