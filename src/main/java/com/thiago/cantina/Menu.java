package com.thiago.cantina;
import java.util.Scanner;

public class Menu {
    public void exibir(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        //Inicio do loop e se encerra quando o usuario clicar em sair


        do {
            System.out.println("\n=== MENU CANTINA ===");
            System.out.println("1. Listar produtos");
            System.out.println("2. Adicionar produtos");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            

            opcao = scanner.nextInt();
            scanner.nextLine();
            
            
            //Estrutura de decisão. a ação ira acontencer conforme o numero escolhido
            switch (opcao) {
                case 1:
                    //Chama o método da pasta "ProdutoDAO"
                    ProdutoDAO.listarProdutos();
                    break;
                 //Ação de adicionar produtod   
                case 2:
                     System.out.print("Nome do produto: ");
                     String nome = scanner.nextLine(); 

                     System.out.print("Descrição: ");
                     String descricao = scanner.nextLine();  

                     System.out.print("Preço: ");
                     double preco = scanner.nextDouble();
                     
                     System.out.print("Nome do produto: ");
                     int quantidade = scanner.nextInt();
                case 3: 
                    //encerra o prgrama com uma mensagem
                     System.out.println("Saindo...");
                     break;      

            
                default:
                    //Se o usuario inserir qualquer coisa fora das opções
                    System.out.println("Opção inválida.");
                    
                 }
           //repete o menu até ir em sair      
         } while (opcao != 3); {
            //Fecha o terminal para novas entradase termina o programa
            scanner.close();
            
         }
    }
}
