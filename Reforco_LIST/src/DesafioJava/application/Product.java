package DesafioJava.application;

public class Product {
    private String nome;
    private Double preco;
    private Integer quantiadde;


    public Product(String nome, Double preco, Integer quantiadde) {
        this.nome = nome;
        this.preco = preco;
        this.quantiadde = quantiadde;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantiadde() {
        return quantiadde;
    }

    public void setQuantiadde(Integer quantiadde) {
        this.quantiadde = quantiadde;
    }

    public String toString(){
        return  String.format("Nome: %s | Preco: R$ %.2fb | Quantidade: %d", nome, preco, quantiadde);
    }
}
