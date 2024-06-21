/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactorymethod.good;

/**
 *
 * @author JAIRO
 */
public class FactoryCliente {
    
    private static Cliente crearClienteCredito(){
        return new ClienteCredito();
    }
    
    private static Cliente crearClienteContado(){
        return new ClienteContado();
    }
    
    public static Cliente crearCliente(FormaPago formaPago){
        Cliente cliente=null;
        switch(formaPago){
            case CONTADO: cliente= crearClienteContado();break;
            case CREDITO: cliente= crearClienteCredito();
        }
        return cliente;
    }
    
    public static Cliente crearClienteDefault(){
        return crearCliente(FormaPago.CONTADO);
    }
    
    
}
