package com.mycompany.catalogozapatos.good;

public class Casual extends Calzado{

    public Casual(ICierre cierre, IMaterial material) {
        super(cierre, material);
    }

    @Override
    public String getDescripcion() {
        return "calzado casual " + this.getCierre().getDescripcionCierre() +
                "\n" + this.getMaterial().getDescripcionMaterial();
    }
}
