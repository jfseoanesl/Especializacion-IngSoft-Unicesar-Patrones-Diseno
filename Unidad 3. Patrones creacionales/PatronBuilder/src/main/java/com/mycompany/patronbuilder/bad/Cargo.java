/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.bad;

/**
 *
 * @author JAIRO
 */
public class Cargo {
    
    private String nombre;
    private double salario;

    public Cargo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo{" + "nombre=" + nombre + ", salario=" + salario + '}';
    }
    
    
    
}
