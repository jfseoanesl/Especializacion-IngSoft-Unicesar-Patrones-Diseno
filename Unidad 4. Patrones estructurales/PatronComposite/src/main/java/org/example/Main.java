package org.example;

public class Main {
    public static void main(String[] args) {

        ProductoSimple a = new ProductoSimple("Jeans",500, "Levis");
        ProductoSimple b = new ProductoSimple("Jeans",200, "Riffle");
        ProductoSimple c = new ProductoSimple("Jeans",100, "Gef");
        ProductoCompuesto pc = new ProductoCompuesto("Kit Jeanes");
        pc.addProducto(a);
        pc.addProducto(b);
        pc.addProducto(c);

        ProductoCompuesto superKitJeanes = new ProductoCompuesto("Super kit");
        superKitJeanes.addProducto(pc);
        superKitJeanes.addProducto(pc);


        Factura factura = new Factura("Jairo");
        factura.addItemFactura(a);
        factura.addItemFactura(b);
        factura.addItemFactura(c);
        factura.addItemFactura(pc);
        factura.addItemFactura(superKitJeanes);

        System.out.println(factura.getInfoFactura());

    }
}