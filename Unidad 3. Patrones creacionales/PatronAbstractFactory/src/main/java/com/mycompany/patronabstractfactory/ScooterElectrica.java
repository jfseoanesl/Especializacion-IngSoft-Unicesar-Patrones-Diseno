/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronabstractfactory;

/**
 *
 * @author JAIRO
 */
public class ScooterElectrica implements IScooter {
    private double kmsAutonomia;

    public ScooterElectrica() {
        this.kmsAutonomia =100;
    }
    
    
    
    @Override
    public String getInfoScooter() {
        return "Scooter electrica ,  Kms de autonomia="+this.kmsAutonomia;
    }
    
}
