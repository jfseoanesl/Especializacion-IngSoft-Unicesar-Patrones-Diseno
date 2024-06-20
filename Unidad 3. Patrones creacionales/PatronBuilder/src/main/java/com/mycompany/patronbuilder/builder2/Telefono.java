/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronbuilder.builder2;




/**
 *
 * @author JAIRO
 */
public class Telefono {
    private String ext;
    private String numero;

    public Telefono(String ext, String numero) {
        this.ext = ext;
        this.numero = numero;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" + "ext=" + ext + ", numero=" + numero + '}';
    }

    
    
}
