/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1008;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class SomaJOptionPane {
    public static void main(String [] args) {
        
        try {
            
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        
        int res = a + b;
        
       JOptionPane.showMessageDialog(null, "O valor da soma é: " + res); 
        }catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Caractere inválido");
    }
    }
}
