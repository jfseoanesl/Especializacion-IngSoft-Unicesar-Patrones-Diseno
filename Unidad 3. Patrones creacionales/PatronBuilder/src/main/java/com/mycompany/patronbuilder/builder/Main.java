/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado.EmpleadoBuilder()
                .cargo("docente", 3000)
                .direccion("valledupar", "sabanas")
                .edad(30)
                .nombre("jairo")
                .id("12345")
                .genero('M')
                .telefono("055","123456")
                .telefono("037", "456789")
                .build();
        
        System.out.println(empleado);
                
        
    }
    
}
