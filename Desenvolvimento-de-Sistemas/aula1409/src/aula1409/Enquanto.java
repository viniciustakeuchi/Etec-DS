/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1409;

/**
 *
 * @author CAMARGO
 */
public class Enquanto {
    
    public static void main(String[] args) {
        
        int i = 0;
        int totalpar = 0;
        int totalimpar = 0;
        
        while (i <= 100) {
            
            int div = i % 2;
            
            
            if (div == 0) {
                System.out.println("par: " + i);
                totalpar = totalpar + i;
            } 
            else if (div == 1){
                System.out.println("ímpar: " + i);
                totalimpar = totalimpar + i;
            }
       
            
        
            
        i++;
        
            System.out.println("total soma ímpar é: " + totalimpar);
            System.out.println("total soma par é: " + totalpar);
            
        
}
        
    }
    
    
}
