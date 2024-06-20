/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class ScooterGasolina implements IScooter {
    private double capacidadTanque;

    public ScooterGasolina() {
        this.capacidadTanque = 100;
    }
    
    
    @Override
    public String getInfoScooter() {
        return "Scooter Gasolina, Capacidd tanque: " + this.capacidadTanque;
    }
    
}
