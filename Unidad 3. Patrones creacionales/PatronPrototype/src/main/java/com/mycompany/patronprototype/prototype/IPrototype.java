/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.patronprototype.prototype;

/**
 *
 * @author JAIRO
 */
public interface IPrototype<T> extends Cloneable {
    
    T clone();
    T deepClone();
    
}
