package org.example.open_close.bad;

public class MainOpenClose {
    public static void main(String[] args) {
        Libro libro = new Libro("patrones de diseño", "GoF", 1995, 100000, "XXX-XX-XX");
        Factura factura = new Factura(libro, 2, 0.2, 0.19);
        PersistenciaFactura.almacenarFactura(TipoPersistencia.LISTA, factura);

    }
}
