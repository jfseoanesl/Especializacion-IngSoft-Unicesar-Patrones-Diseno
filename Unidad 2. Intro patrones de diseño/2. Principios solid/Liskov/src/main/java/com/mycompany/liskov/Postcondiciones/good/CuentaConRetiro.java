/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Postcondiciones.good;


/**
 *
 * @author JAIRO
 */
public class CuentaConRetiro extends CuentaBancaria {
    public CuentaConRetiro(double saldo) {
        super(saldo);
    }

    public CuentaConRetiro() {
    }
    public void retirar(double monto){
        if(monto<=0)
            throw new IllegalArgumentException("Monto no permitido");

        if(this.getSaldo()<monto)
            throw new IllegalArgumentException("Saldo insuficiente");

        this.setSaldo(this.getSaldo()-monto);

    }



    
    
    
    
    
}
