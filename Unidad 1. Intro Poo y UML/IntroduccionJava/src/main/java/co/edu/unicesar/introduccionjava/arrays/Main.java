/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.introduccionjava.arrays;

import java.util.Arrays;

/**
 *
 * @author Jairo F
 */
public class Main {
    public static void main(String[] args) {
        
        int intArray[] = {0,9,7,5,3,2,1};
        int intArray2[] = {4,5,2};
        
        Arrays.sort(intArray, 0, 7);
        System.out.print("arreglo ordenado: ");
        printArreglo(intArray);
        System.out.println("suma arreglo: " + sumar(intArray));
        
        int matriz[][] = {intArray, intArray2};
        System.out.println("suma matriz: " + sumar(matriz));
    }
    public static int sumar(int[][] matriz){
        int suma =0;
        for(int i=0; i<matriz.length; i++){
//            for(int j=0; j<matriz[i].length; j++){
//                suma += matriz[i][j];
//            }
             suma+=sumar(matriz[i]);
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
    
    public static void printArreglo(int array[]){
        int suma=0;
         for(int i=0; i<array.length; i++){
             System.out.print(array[i]+"");
         }
         System.out.println("");
    }
}
