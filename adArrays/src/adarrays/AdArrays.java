/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adarrays;

/**
 *
 * @author ingri
 */
public class AdArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declara mi array numeros de 3 elementos de ytipo entero
        int numeros[]= new int[3];
        System.out.println("numeros 0 "+ numeros);
        
        numeros [0] = 15;
        numeros [1] = 3;
        numeros [2] = 5;
        
         for (int i = 0; i < numeros.length; i++) {
             System.out.println("numeros ["+ i +"]"+ numeros[i]);
        }
        
        
    }
    
    
}
