package org.example.decorators;

import org.example.components.AbstractCombo;
import org.example.components.AdicionalDecorator;

public class Papa extends AdicionalDecorator {
    public Papa(AbstractCombo combo) {
        super(combo);
    }


    @Override
    public String getDescripcion() {
        return this.getCombo().getDescripcion() + " + adicioanl de papas ";
    }

    @Override
    public double getPrecio(){
        return this.getCombo().getPrecio() + 1000;
    }
}
