/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.introduccionjava.tiposdedatos;

import java.util.Arrays;

/**
 *
 * @author Jairo F
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intVar = 5;
        long longVar = 10_000_000;
        char charVar='c' ;
        float floatVar = 12.5f;
        double doubleVar = 12.5;
        var nombreVar = 100L; // inferencia de tipo
        
        longVar = 3; // promocion
        intVar = (int)longVar; // conversion
        
        Integer integerVar = Integer.valueOf(5); // Clase Wrapper
        System.out.println(Double.MIN_VALUE +" , " + Double.MAX_VALUE); 
        
        Integer autoboxing = 8;
        int unboxing = Integer.valueOf(5);
        
        int a = 5, b=0;
        b = ++a;
        System.out.println(b==a);
        b= a++;
        System.out.println(b==a);
       
    }
    
    public static int sumar(int[][] matriz){
        int suma =0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    public static int sumar(int arreglo[]){
         int suma=0;
         for(int i=0; i<arreglo.length; i++){
             suma+=arreglo[i];
         }
         return suma;
    }
    
    
    
}
