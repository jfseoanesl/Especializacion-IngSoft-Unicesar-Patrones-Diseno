package org.example.components;

public class ComboEspecial extends AbstractCombo{


    public ComboEspecial() {
        this.setDescripcion("Combo especial");
    }

    @Override
    public double getPrecio() {
        return 6000;
    }
}
