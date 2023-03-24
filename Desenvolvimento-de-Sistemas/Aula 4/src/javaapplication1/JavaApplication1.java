package javaapplication1;

import java.util.Scanner;
        
public class JavaApplication1 {

   public static void main(String[] args) {

    int a, b, c;
    int escolha = 1;

    while (escolha == 1) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        a = s.nextInt();
        System.out.println("Digite o valor de b:");
        b = s.nextInt();
        System.out.println("Digite o valor de c:");
        c = s.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if (a == b && a == c) {
                System.out.println("Triangulo Equilatero");
            } else if ((a == b) || (a == c)) {
                System.out.println("Triangulo Isosceles");
            } else 
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não é um triangulo!");
        }
        System.out.println("==================================");
        System.out.println("Deseja continuar? 1 = sim, 2 = não");
        escolha = s.nextInt();
        System.out.println("==================================");
    }
       
       
    }
    
}
