/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

/**
 *
 * @author CAMARGO
 */
public class ConnectionFactory {
    // situa em qual package ou “pacote” está a classe

// faz as importações de classes necessárias para o funcionamento do programa
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
