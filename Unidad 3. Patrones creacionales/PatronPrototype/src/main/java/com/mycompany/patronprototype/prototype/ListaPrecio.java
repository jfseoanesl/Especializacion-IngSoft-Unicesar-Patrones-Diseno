/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronprototype.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public class ListaPrecio implements IPrototype<ListaPrecio> {
    private String nombre;
    private List<Producto> productos = new ArrayList();

    public ListaPrecio() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "ListaPrecio{" + "nombre=" + nombre + ", productos=" + productos + '}';
    }

    @Override
    public ListaPrecio clone() {
        
        ListaPrecio clone = new ListaPrecio();
        clone.setNombre(this.nombre);
        clone.setProductos(this.productos);
        return clone;
    }

    @Override
    public ListaPrecio deepClone() {
        
        List<Producto> productosClone = new ArrayList();
        for(Producto p: this.productos){
            productosClone.add(p.clone());
        }
        
        ListaPrecio clone = new ListaPrecio();
        clone.setNombre(this.nombre);
        clone.setProductos(productosClone);
        return clone;
    }
    
    
    
}
