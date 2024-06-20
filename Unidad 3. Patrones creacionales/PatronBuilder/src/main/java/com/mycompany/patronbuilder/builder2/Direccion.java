/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder2;



/**
 *
 * @author JAIRO
 */
public class Direccion {
    
    private String ciudad;
    private String barrio;

    public Direccion(String ciudad, String barrio) {
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "ciudad=" + ciudad + ", barrio=" + barrio + '}';
    }
    
    
    
}
