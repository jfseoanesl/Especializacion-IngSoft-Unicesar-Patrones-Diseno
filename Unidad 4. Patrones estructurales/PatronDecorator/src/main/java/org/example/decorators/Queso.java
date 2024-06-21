package org.example.decorators;

import org.example.components.AbstractCombo;
import org.example.components.AdicionalDecorator;

public class Queso extends AdicionalDecorator {

    public Queso(AbstractCombo combo) {
        super(combo);
    }

    @Override
    public double getPrecio() {
        return this.getCombo().getPrecio() + 1200;
    }

    @Override
    public String getDescripcion(){
        return this.getCombo().getDescripcion() + " + adicional de queso ";
    }
}
