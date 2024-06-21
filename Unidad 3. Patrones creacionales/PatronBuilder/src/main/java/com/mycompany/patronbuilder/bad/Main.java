/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.bad;

import java.util.ArrayList;
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
        List<Telefono> telefonos = new ArrayList<>();
        telefonos.add(new Telefono("123", "123456"));
        telefonos.add(new Telefono("555", "848484"));

        Empleado empleado = new Empleado("123", "Jairo", 30, 'M', cargo, direccion, telefonos);
        System.out.println(empleado);
        
    }
    
}
