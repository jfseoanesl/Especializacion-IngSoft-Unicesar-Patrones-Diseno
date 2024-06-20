/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.bad;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        Cargo cargo = new Cargo("Docente", 30000);
        Direccion direccion = new Direccion("Valledupa", "sabanas");
        List<Telefono> telefonos = Arrays.asList(new Telefono("601", "123456"), new Telefono("036", "xxxxxxxx"));
        
        Empleado empleado = new Empleado("123", "Jairo", 30, 'M', cargo, direccion, telefonos);
        System.out.println(empleado);
        
    }
    
}
