/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class ParÍmpar {
    
    public static void main(String[] args) {
        int num1, num2, soma, resto;
       
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num1 = x.nextInt();
        
        System.out.println("Digite outro número: ");
        num2 = x.nextInt();
        
        soma = num1 + num2;
        resto = soma % 2;
        
        if (resto == 1){
            System.out.println("Ímpar");
        }
        else {
            System.out.println("Par");
        }
        
        
        
        
        
        
        
      
    }
 
}
