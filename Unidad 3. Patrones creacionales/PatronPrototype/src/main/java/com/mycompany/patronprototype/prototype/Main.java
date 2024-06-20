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
public class Main {
    public static void main(String[] args) {
        
        List<Producto>productos = new ArrayList();
        productos.add(new Producto("Papa", 2000));
        productos.add(new Producto("Yuca", 5000));
        ListaPrecio listaStandard = new ListaPrecio();
        listaStandard.setNombre("standard");
        listaStandard.setProductos(productos);
        
        PrototypeFactory.addPrototype(listaStandard.getNombre(), listaStandard);
        
        ListaPrecio listaMayoreo = obtenerLista(listaStandard.getNombre(), "ListaMayoreo", 0.9);
        PrototypeFactory.addPrototype(listaMayoreo.getNombre(), listaMayoreo);
        
        ListaPrecio listaVIP = obtenerLista(listaMayoreo.getNombre(), "ListaVIP", 0.9);
        
        System.out.println(listaStandard);
        System.out.println(listaMayoreo);
        System.out.println(listaVIP);
       
    }
    
    public static ListaPrecio obtenerLista(String name, String newName, double ajustePrecio){
        
        ListaPrecio lista = (ListaPrecio)PrototypeFactory.getPrototype(name);
        for(Producto p: lista.getProductos()){
            p.setPrecio(p.getPrecio()*ajustePrecio);
        }
        lista.setNombre(newName);
        return lista;
    }
    
}
