package org.example.srp.good;

import java.util.ArrayList;
import java.util.List;

public class ArchivoFactura {

    private static List<Factura> archivo = new ArrayList();

    public static void guardarFactura(Factura f){
        archivo.add(f);
    }

}
