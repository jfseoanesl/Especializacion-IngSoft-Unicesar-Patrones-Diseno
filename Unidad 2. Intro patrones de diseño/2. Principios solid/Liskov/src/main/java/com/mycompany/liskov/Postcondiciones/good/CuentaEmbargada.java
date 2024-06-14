/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Postcondiciones.good;



/**
 *
 * @author JAIRO
 */
public class CuentaEmbargada extends CuentaBancaria {
    private static  final double EMBARGO = 100;
    public CuentaEmbargada(double saldo) {
        super(saldo);
    }

    public CuentaEmbargada() {
    }

    public void aplicarEmbargo(){
        this.retirar(EMBARGO);
    }

    
    
    
    
}
