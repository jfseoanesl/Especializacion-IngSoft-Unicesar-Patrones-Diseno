/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

/**
 *
 * @author JAIRO
 */
public class Cargo {
    
    private String descripcion;
    private double saldo;

    public Cargo() {
    }

    public Cargo(String descripcion, double saldo) {
        this.descripcion = descripcion;
        this.saldo = saldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cargo{" + "descripcion=" + descripcion + ", saldo=" + saldo + '}';
    }
    
    
    
}
