package DesafioJava.application.application;



import DesafioJava.application.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        int option;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar e Atualizar Quantidade");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (option) {
                case 1:
                    System.out.println("\n--- Cadastro de Produto ---");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    // aqui ja adicionou direto sem precisar cria o metodo construtor separado
                    productList.add(new Product(nome, preco, quantidade));
                    System.out.println("✅ Produto cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Produtos ---");
                    if (productList.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Product p : productList) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o nome do produto para atualizar: ");
                    String nomeBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Product p : productList) {
                        if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                            encontrado = true;
                            System.out.println("Produto encontrado: " + p);
                            System.out.print("Deseja adicionar quantas unidades? ");
                            int add = sc.nextInt();
                            sc.nextLine();
                            p.setQuantiadde(p.getQuantiadde() + add);
                            System.out.println("✅ Quantidade atualizada com sucesso.");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("❌ Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("\nDigite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                            System.out.println("Produto removido: " + productList.get(i));
                            productList.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("❌ Produto não encontrado.");
                    } else {
                        System.out.println("✅ Produto removido com sucesso.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }

        } while (option != 5);

        sc.close();
    }
}
