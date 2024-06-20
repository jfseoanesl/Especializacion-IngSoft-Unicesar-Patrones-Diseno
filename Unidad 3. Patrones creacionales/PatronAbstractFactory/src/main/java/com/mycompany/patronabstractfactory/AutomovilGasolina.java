/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class AutomovilGasolina implements IAutomovil {
    private double capacidadTanque;

    public AutomovilGasolina() {
        this.capacidadTanque=15;
    }

    @Override
    public String getInfoAutomovil() {
        return "Automovial de gasolina , capacidad tanque="+this.capacidadTanque;
    }
    
    
}
