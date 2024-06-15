package org.example.open_close.good;

public class MainOpenClose {
    public static void main(String[] args) {

        Libro libro = new Libro("patrones de diseño", "GoF", 1995, 100000, "XXX-XX-XX");
        Factura factura = new Factura(libro, 2, 0.2, 0.19);
        IPersistenciaFactura persistencia = new PersistenciaEnLista();
        System.out.println("No elementos: " + persistencia.getSize());
        persistencia.almacenarFactura(factura);
        System.out.println("No elementos: " + persistencia.getSize());

    }
}
