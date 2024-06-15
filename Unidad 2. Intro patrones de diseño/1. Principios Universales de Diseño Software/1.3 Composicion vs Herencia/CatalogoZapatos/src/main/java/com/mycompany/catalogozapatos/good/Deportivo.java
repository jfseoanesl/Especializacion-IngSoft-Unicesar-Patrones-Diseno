package com.mycompany.catalogozapatos.good;

public class Deportivo extends Calzado{

    public Deportivo(ICierre cierre, IMaterial material) {
        super(cierre, material);
    }

    @Override
    public String getDescripcion() {
        return " calzado deportivo " + "\n" +
                this.getMaterial().getDescripcionMaterial() + "\n"
                + this.getCierre().getDescripcionCierre();
    }
}
