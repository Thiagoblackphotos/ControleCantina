package com.thiago.cantina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ProdutoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/cantina";
    private static final String USUARIO = "root";
    private static final String SENHA = ""; // coloque sua senha do MySQL aqui, se tiver
public void cadastrarProdutos(String nome, String descricao, double preco int quantidade_estoque)
    

    public static void listarProdutos() {
        String sql = "SELECT * FROM produtos";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n=== Lista de Produtos ===");
            while (rs.next()) {
                System.out.printf("ID: %d | Nome: %s | Preço: %.2f | Estoque: %d\n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getInt("quantidade_estoque"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }
    }

    public static void adicionarProduto(String nome, String descricao, double preco, int quantidade) {
        String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade_estoque) VALUES (?,?,?,?)";
        try(Connection conn = conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, descricao);
                stmt.setDouble(3, preco);
                stmt.setInt(4, quantidadeEstoque); 
                int linhasAfetadas = stmt.executeUpdate();
                if (linhasAfetadas > 0 ){
                    System.out.println("Produto cadastrado com sucesso!");
                } else{
                    System.out.println("Falha ap cadastrar produto.");

                }  catch (SQLException e ){
                    System.out.println("Erro ao cadastrar produto:" + );
                }
            }




        String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade_estoque) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setDouble(3, preco);
            stmt.setInt(4, quantidade);

            stmt.executeUpdate();
            System.out.println("Produto adicionado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }
}
