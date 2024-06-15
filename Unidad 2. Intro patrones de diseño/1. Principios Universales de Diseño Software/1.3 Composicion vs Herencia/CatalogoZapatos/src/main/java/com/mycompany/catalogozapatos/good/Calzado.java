package com.mycompany.catalogozapatos.good;

public abstract class Calzado {
    private ICierre cierre;
    private IMaterial material;
    public abstract String getDescripcion();

    public Calzado(ICierre cierre, IMaterial material) {
        this.cierre = cierre;
        this.material = material;
    }

    public ICierre getCierre() {
        return cierre;
    }

    public void setCierre(ICierre cierre) {
        this.cierre = cierre;
    }

    public IMaterial getMaterial() {
        return material;
    }

    public void setMaterial(IMaterial material) {
        this.material = material;
    }
}
