package com.company;

public class Compras {
    Pessoa pessoa;
    Produto produto;

    public Compras (){}

    public Compras(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void comprar(Pessoa pessoa,Produto produto){
        System.out.printf(" olá %s, você adicionou o produto %s no carrinho: ", pessoa.getNome(),produto.getNome());

    }
    public  String verificarCompra(String confirmar){
        if(confirmar=="Sim"){
            return "Compra confirmada";
        }
        else{
            return "Compra rechazada";
        }

    }
}
