/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronprototype.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JAIRO
 */
public class PrototypeFactory {
    
    private static Map<String, IPrototype> prototypes= new HashMap();
    
    public static void addPrototype(String name, IPrototype prototype){
        prototypes.put(name, prototype);
    };
    
    public static IPrototype getPrototype(String name){
        return (IPrototype)prototypes.get(name).deepClone();
    }
    
}
