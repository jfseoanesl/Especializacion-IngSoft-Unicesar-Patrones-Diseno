/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactorymethod.good;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = FactoryCliente.crearCliente(TipoCliente.CREDITO);
        System.out.println(cliente.crearPedido());
        
    }
}
