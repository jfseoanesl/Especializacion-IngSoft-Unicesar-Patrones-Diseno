package org.example.decorators;

import org.example.components.AbstractCombo;
import org.example.components.AdicionalDecorator;

public class Carne extends AdicionalDecorator {

    public Carne(AbstractCombo combo) {
        super(combo);
    }

    @Override
    public double getPrecio() {
        return this.getCombo().getPrecio() + 1400;
    }

    @Override
    public String getDescripcion() {
        return this.getCombo().getDescripcion() + " + adicional de carne ";
    }
}
