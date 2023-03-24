/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        int num;
        int escolha = 1;
        
        while (escolha == 1) {
            
        Scanner y = new Scanner(System.in);
        
        System.out.println("Digite um número");
        num = y.nextInt();
        
        if (num < 0){
            System.out.println("Número Negativo");
        }
        else {
            System.out.println("Número Positivo");
        }
        System.out.println("==================================");
        System.out.println("Deseja continuar? 1 = sim 2 = não");
        System.out.println("==================================");
        escolha = y.nextInt();
        
    }

    }
}