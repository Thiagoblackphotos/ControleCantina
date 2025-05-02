package com.thiago.cantina;


import java.time.LocalDateTime;



public class Venda {
    private int id;
    private Produtos produto;
    private int quantidade;
    private double precoUnitario;
    private LocalDateTime dataHora;

    //Construtor
    public Venda(int id, Produtos produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco(); //Garante que o preço não mude depois
        this.dataHora = LocalDateTime.now(); //Registra o momento atual da venda
    }


    public int getId(){
        return id;
    }

    public Produtos getProdutos() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
        
    }

    public double getValorTotal() {
        return precoUnitario * quantidade;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

}