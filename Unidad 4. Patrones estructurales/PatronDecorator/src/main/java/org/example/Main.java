package org.example;

import org.example.components.AbstractCombo;
import org.example.components.AdicionalDecorator;
import org.example.components.ComboFamiliar;
import org.example.decorators.Papa;
import org.example.decorators.Queso;

public class Main {
    public static void main(String[] args) {
        AbstractCombo familiar = new ComboFamiliar();
        imprimirCombo(familiar);

        AdicionalDecorator familiarConPapas = new Papa(familiar);
        imprimirCombo(familiarConPapas);

        AdicionalDecorator familiarConPapasYQueso = new Queso(familiarConPapas);
        imprimirCombo(familiarConPapasYQueso);

    }

    public static void imprimirCombo(AbstractCombo combo){
        System.out.println(combo.getDescripcion()+ " , precio: " + combo.getPrecio());
    }
}