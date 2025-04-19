
package com.thiago.cantina;

public class Produtos {
    //Caracteristicas dos produtos, (private é para que seja respeitado o capsulamento)

    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    
// aqui fica oque é chamado de construtor onde é adicionado um novo produto
    public Produtos(int id, String nome, double preco, int quantidade) {
        
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // get serve para acesar valores atribuidos, ou seja onde o codigo ira pesquisar
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void reduzirQuantidade(int quantidadeVendida){
        this.quantidade -= quantidadeVendida;
    
    
    }

    @Override
    public String toString(){
        return "ID: " + id + "| Nome: " + " | preço: R$" + preco + " | Quantidade:" + quantidade; 
    }
       




}  


    




