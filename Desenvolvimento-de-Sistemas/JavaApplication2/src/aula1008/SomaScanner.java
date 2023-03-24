/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1008;

import java.util.Scanner;

/*
public static void main(String [] args {
Scanner x = new Scanner (System.in);


*/
public class SomaScanner {
 
    public static void main(String[] args) { 
        Scanner x = new Scanner (System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = x.nextInt();
        
        System.out.println("Digite o valor de B");
        int b = x.nextInt();
        
       
        int res = a + b;
         
        System.out.println("O valor da soma é: " + res);
         
    
    }
    
}


