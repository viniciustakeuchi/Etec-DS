
package javaapplication1;

import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        int a, b,c;
        Scanner x = new Scanner (System.in);
        
        System.out.println("Digite o valor de a: ");
        a = x.nextInt();
        
        System.out.println("Digite o valor de b: ");
        b = x.nextInt();
        
        System.out.println("Digite o valor de c: ");
        c = x.nextInt();
        
        if ((a<b)&&(b<c)&&(a<c)) {
        System.out.println("A B C");
        
    }else if((a<b)&&(b>c)&&(c>a)){
        System.out.println("A C B");
    }else if ((b<a)&&(c>a)&&(b<c)){
        System.out.println("B A C");
    }
        
    }
}
