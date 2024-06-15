package org.example.srp.good;

public class ReporteFactura {

    public static void imprimeFactura(Factura f) {
        System.out.println(f.getCantidad() + " x "
                           + f.getLibro().getNombre() + " * $"
                           +  f.getLibro().getPrecio() );
        System.out.println("Tasa de Descuento: " + f.getTasaDescuento());
        System.out.println("Tasa de Impuesto: " + f.getTasaDescuento());
        System.out.println("Total: " + f.getTotal());
    }


}
