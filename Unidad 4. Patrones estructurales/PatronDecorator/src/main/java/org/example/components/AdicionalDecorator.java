package org.example.components;

public abstract class AdicionalDecorator extends AbstractCombo {
    private AbstractCombo combo;

    public AdicionalDecorator(AbstractCombo combo) {
        this.combo = combo;
    }

    public AbstractCombo getCombo() {
        return combo;
    }

    public void setCombo(AbstractCombo combo) {
        this.combo = combo;
    }
}
