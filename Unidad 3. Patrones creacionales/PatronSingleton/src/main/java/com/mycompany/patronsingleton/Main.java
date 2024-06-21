/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronsingleton;

import java.util.Calendar;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        printInfoApp();
        setInfoApp();
        printInfoApp();



        
    }
    
    public static void printInfoApp(){
        ConfiguracionSingleton config = ConfiguracionSingleton.getInstance();
        System.out.println(config.getInfoAplicacion());
    }
    
    public static void setInfoApp(){
        ConfiguracionSingleton singleton = ConfiguracionSingleton.getInstance();
        singleton.setAppVersion("version 5.5");
    }
}
