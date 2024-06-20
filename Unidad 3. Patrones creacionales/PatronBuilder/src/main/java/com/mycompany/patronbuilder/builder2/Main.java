/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder2;

;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        Empleado empleado = new EmpleadoBuilder()
                .cargo("docente", 3000)
                .direccion("valledupar", "sabanas")
                .edad(30)
                .nombre("jairo")
                .id("12345")
                .genero('M')
                .build();
        
        System.out.println(empleado);
                
        
    }
    
}
