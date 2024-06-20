/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public class Empleado {
    
    private String id;
    private String nombre;
    private int edad;
    private char genero;
    private Cargo cargo;
    private List<Telefono> telefonos;
    private Direccion direccion;

    public Empleado(String id, String nombre, int edad, char genero, Cargo cargo, Direccion direccion, List<Telefono> telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefonos=telefonos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cargo=" + cargo + ", telefonos=" + telefonos + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
