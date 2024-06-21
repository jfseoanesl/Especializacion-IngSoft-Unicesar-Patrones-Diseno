package org.example.components;

public class ComboBasico extends AbstractCombo {


    public ComboBasico() {
        this.setDescripcion("Combo basico");
    }

    @Override
    public double getPrecio() {
        return 1500;
    }
}
