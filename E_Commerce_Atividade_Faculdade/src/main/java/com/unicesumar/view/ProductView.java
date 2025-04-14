package com.unicesumar.view;

import com.unicesumar.entities.DTOs.DTOProduct;

import java.util.Scanner;

public class ProductView {

    Scanner teclado = new Scanner(System.in);
    public DTOProduct novoProduto(){
        System.out.println("Cadastrar Produto");
        System.out.println("Insira o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.println("Insira o preço do produto:");
        Double preco = teclado.nextDouble();

        if ( nome.isEmpty() )
            return null;

        return new DTOProduct( nome, preco );
    }

}
