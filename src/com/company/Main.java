package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Produto produto1=new Produto(123454,"TV");
        Produto produto2 = new Produto(876543,"Geladeira");
        Compras compra = new Compras();

        System.out.println("Para o cadastro do seus dados insira o seu nome por gentileza");
        String name= sc.next();
        System.out.println("Insira seu numero por gentileza");
        String number = sc.next();
        System.out.println("Insira seu logradouro");
        String logradouro = sc.next();
        System.out.println("Insira a sua cidade");
        String city = sc.next();
        System.out.println("Insira o seu estado");
        String estate = sc.next();

        Endereco address = new Endereco();
        address.setLogradouro(logradouro);
        address.setCidade(city);
        address.setEstado(estate);

        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco(address);
        pessoa.setNome(name);
        pessoa.setNumero(number);

        System.out.printf("Olá %s, escolha o produto que você deseja comprar", pessoa.getNome());
        System.out.println("\n Os produtos são:\n TV\n Geladeira\n");
        String escolhido= sc.next();
        if(escolhido.equals("TV")){
            compra.comprar(pessoa,produto1);
            System.out.println("Você confirma a compra?");
            String conf=sc.next();
            compra.verificarCompra(conf);
            System.out.printf(" Olá %s você realizou a compra de uma %s",pessoa.getNome(),produto1.getNome());
        }
        else if(escolhido.equals("Geladeira")){
            compra.comprar(pessoa,produto2);
            System.out.println("Você confirma a compra?");
            String conf=sc.nextLine();
            compra.verificarCompra(conf);
            System.out.printf("Olá %s você realizou a compra de uma %s", pessoa.getNome(),produto2.getNome());
        }
        else {
            System.out.println("Esse produto não encontra-se no estoque");
        }


    }
}
