package com.thiago.cantina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //URL: é o caminho até seu banco 
    private static final String URL = "jdbc:mysql://localhost:3306/cantina";
    //USUARIO e SENHA: são os dados de acesso ao meu banco
    private static final String USUARIO = "root";
    private static final String SENHA = "sua_senha";

    public static Connection conectar() {
        try {
            //DriverManager.getConnection(...): tenta abrir a conexão
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
