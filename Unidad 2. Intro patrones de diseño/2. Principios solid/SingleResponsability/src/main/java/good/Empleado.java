/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

import java.util.logging.Logger;

/**
 *
 * @author JAIRO
 */
public class Empleado {
    
    private String name;
    private Cargo cargo;

    public Empleado() {
    }

    public Empleado(String name, Cargo cargo) {
        this.name = name;
        this.cargo = cargo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", cargo=" + cargo + '}';
    }

    
    public static class EmpleadoBuilder{
        
        private String name;
        private Cargo cargo;

        public EmpleadoBuilder() {
        }
        
        public EmpleadoBuilder nombre(String nombre){
            this.name=nombre;
            return this;
        }
        
        public EmpleadoBuilder cargo(String descripcion, double salario){
            this.cargo = new Cargo(descripcion, salario);
            return this;
        }
        
        public Empleado build(){
            return new Empleado(this.name, this.cargo);
        }
    
    }
    
    
}
