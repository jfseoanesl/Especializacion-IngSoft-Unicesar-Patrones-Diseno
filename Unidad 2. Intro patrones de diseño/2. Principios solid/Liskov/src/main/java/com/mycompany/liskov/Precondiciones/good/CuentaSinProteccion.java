/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Precondiciones.good;

/**
 *
 * @author JAIRO
 */
public class CuentaSinProteccion extends CuentaBancaria {
    
    public CuentaSinProteccion(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {
        if(this.getSaldo() < monto )
            throw new IllegalArgumentException("saldo insuficiente");

        this.setSaldo(this.getSaldo()-monto);
    }
    
    
    
}
