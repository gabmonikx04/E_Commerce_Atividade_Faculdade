package com.unicesumar.view;

import java.util.Scanner;

public class ViewE_Commerce {

    Scanner teclado = new Scanner( System.in );

    public int inicio(){

        int option;

        System.out.println("\n---MENU---");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listas Produtos");
        System.out.println("3 - Cadastrar Usuário");
        System.out.println("4 - Listar Usuários");
        System.out.println("5 - Sair");
        System.out.println("Escolha uma opção: ");
        option = teclado.nextInt();
        teclado.nextLine();
        return  option;
    }

}
