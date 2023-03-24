/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcao;

import javax.swing.JOptionPane;


public class Soma {

    void soma () {
    try{
        
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
    
    int res = a+b;
    JOptionPane.showMessageDialog(null, "O valor da soma é: "+res);
          }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere Inválido");
          }
 }
    
    void sub() {
        
    try{
        
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
    
    int res = a-b;
    JOptionPane.showMessageDialog(null, "O valor da soma é: "+res);
          }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere Inválido");
          }
  }


    void div() {

    try{ 
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
    
    int res = a / b;
    JOptionPane.showMessageDialog(null, "O valor da soma é: "+res);
          }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere Inválido");
          }
 }
    
    void mul() {
        
    try{
        
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
    
    int res = a * b;
    JOptionPane.showMessageDialog(null, "O valor da soma é: "+res);
          }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Caractere Inválido");
          }
 }
}
  

 

    

