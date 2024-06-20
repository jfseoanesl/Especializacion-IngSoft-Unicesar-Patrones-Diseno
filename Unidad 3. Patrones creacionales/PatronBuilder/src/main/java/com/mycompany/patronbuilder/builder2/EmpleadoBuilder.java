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
public  class  EmpleadoBuilder{

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