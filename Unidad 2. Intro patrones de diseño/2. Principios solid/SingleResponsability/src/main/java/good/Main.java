/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        
        Empleado e = new Empleado.EmpleadoBuilder().nombre("nombre").cargo("sistemas", 1000).build();
        System.out.println(e);
    }
    
}
