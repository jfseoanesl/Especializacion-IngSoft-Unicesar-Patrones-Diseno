package org.example.open_close.good;

import java.util.ArrayList;
import java.util.List;

public class PersistenciaEnLista implements IPersistenciaFactura{
    private List<Factura> archivo = new ArrayList<>();

    @Override
    public void almacenarFactura(Factura f) {
        this.archivo.add(f);
    }

    @Override
    public int getSize(){
        return this.archivo.size();
    }
}
