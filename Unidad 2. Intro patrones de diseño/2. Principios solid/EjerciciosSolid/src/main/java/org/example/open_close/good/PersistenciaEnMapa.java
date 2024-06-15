package org.example.open_close.good;

import java.util.HashMap;
import java.util.Map;

public class PersistenciaEnMapa implements IPersistenciaFactura{
    private Map<Integer, Factura> archivo = new HashMap<>();

    @Override
    public void almacenarFactura(Factura f) {
        int n = this.archivo.size() + 1;
        this.archivo.put(n, f);
    }

    @Override
    public int getSize(){
        return this.archivo.size();
    }
}
