/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class AutomovilElectrico implements IAutomovil{
    private double kmsAutonomia;

    public AutomovilElectrico() {
        this.kmsAutonomia=100;
    }
    
     @Override
    public String getInfoAutomovil() {
        return "Automovial electrico , kms de autonomia="+this.kmsAutonomia;
    }
    
}
