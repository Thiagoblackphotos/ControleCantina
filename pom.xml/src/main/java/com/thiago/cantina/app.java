package com.thiago.cantina;

//Chama o método Conexao.conectar() Se a conexão funcionar, mostra "Conexão bem-sucedida!Se não, mostra erro no terminal
import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection conn = Conexao.conectar();

        if (conn != null) {
            System.out.println("Conexão bem-sucedida!");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
}

