/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class FactoryVehiculo {
    
    public static AbstractFactoryVehiculo getFactoryVehiculo(FactoryVehiculoType type){
        AbstractFactoryVehiculo factory=null;
        switch(type){
            case GASOLINA: factory = new FactoryVehiculoGasolina(); break;
            case ELECTRICO:factory = new FactoryVehiculoElectrico();     
        }
        
        return factory;
    }
    
    public static AbstractFactoryVehiculo getFactoryvehiculo(){
        return getFactoryVehiculo(FactoryVehiculoType.GASOLINA);
    }
    
}
