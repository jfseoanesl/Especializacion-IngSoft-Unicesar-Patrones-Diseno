package org.example.components;

public class ComboFamiliar extends AbstractCombo{


    public ComboFamiliar() {
        this.setDescripcion("Combo familiar");
    }

    @Override
    public double getPrecio() {
        return 3000;
    }
}
