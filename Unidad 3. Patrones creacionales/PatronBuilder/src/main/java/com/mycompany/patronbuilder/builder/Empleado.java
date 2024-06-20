/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder;


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
    
    
    
    public static class  EmpleadoBuilder{

        private String id;
        private String nombre;
        private int edad;
        private char genero;
        private Cargo cargo;
        private List<Telefono> telefonos;
        private Direccion direccion;

        public EmpleadoBuilder() {
            this.telefonos = new ArrayList();
        }
        
        public EmpleadoBuilder id(String id){
            this.id = id;
            return this;
        }
        
        public EmpleadoBuilder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public EmpleadoBuilder edad(int edad){
            this.edad = edad;
            return this;
        }
        
        public EmpleadoBuilder genero(char genero){
            this.genero=genero;
            return this;
        }
        
        public EmpleadoBuilder cargo(String nombre, double salario){
            this.cargo = new Cargo(nombre, salario);
            return this;
        }
        public EmpleadoBuilder direccion(String ciudad, String barrio){
            this.direccion = new Direccion(ciudad, barrio);
            return this;
        }
        
        public EmpleadoBuilder telefono(String ext, String numero){
            this.telefonos.add(new Telefono(ext, numero));
            return this;
        }
        
        public Empleado build(){
            Empleado empleado = new Empleado(id, nombre, edad, genero, cargo, direccion, telefonos);
            return empleado;
        }
        
        
    
    }
    
}
