package org.example.decorators;

import org.example.components.AbstractCombo;
import org.example.components.AdicionalDecorator;

public class Tomate extends AdicionalDecorator {

    public Tomate(AbstractCombo combo) {
        super(combo);
    }

    @Override
    public double getPrecio() {
        return this.getCombo().getPrecio() + 1100;
    }

    @Override
    public String getDescripcion() {
        return this.getCombo().getDescripcion() + " + adicional de tomate ";
    }
}
