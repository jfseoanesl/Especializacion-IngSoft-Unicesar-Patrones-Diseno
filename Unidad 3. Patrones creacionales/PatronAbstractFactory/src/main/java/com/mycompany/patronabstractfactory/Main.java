/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        
        AbstractFactoryVehiculo factoryGasolina = FactoryVehiculo.getFactoryVehiculo(FactoryVehiculoType.GASOLINA);
        IAutomovil automovilGasolina = factoryGasolina.crearAutomovil();
        System.out.println(automovilGasolina.getInfoAutomovil());
        IScooter scooterGasolina = factoryGasolina.crearScooter();
        System.out.println(scooterGasolina.getInfoScooter());
        
    }
}
