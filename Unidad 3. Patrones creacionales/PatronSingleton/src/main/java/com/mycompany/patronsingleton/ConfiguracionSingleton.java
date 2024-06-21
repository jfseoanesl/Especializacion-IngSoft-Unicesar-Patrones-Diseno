/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronsingleton;

/**
 *
 * @author JAIRO
 */
public class ConfiguracionSingleton {
    
    private String appName;
    private String appVersion;
    private static ConfiguracionSingleton singleton;

    private ConfiguracionSingleton() {
        this.appName = "Aplicacion singleton";
        this.appVersion = "Version 1.1";
    }
    
    public String getInfoAplicacion(){
        return this.getAppName() +" , " + this.getAppVersion();
    }
    
    private static void crearInstancia(){
        singleton = new ConfiguracionSingleton();
    }
    
    public static ConfiguracionSingleton getInstance(){
        if(getSingleton()==null){
            crearInstancia();
        }
        return getSingleton();

    }

    /**
     * @return the appName
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName the appName to set
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @return the appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion the appVersion to set
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * @return the singleton
     */
    public static ConfiguracionSingleton getSingleton() {
        return singleton;
    }
    
    
    
    
    
}
