/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class FactoryVehiculoGasolina implements AbstractFactoryVehiculo {

    @Override
    public IScooter crearScooter() {
        return new ScooterGasolina();
    }

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilGasolina();
    }
    
}
