package com.unicesumar.controller;

import com.unicesumar.entities.DTOs.DTOProduct;
import com.unicesumar.entities.Product;
import com.unicesumar.view.ProductView;

public class ControllerE_CommerceProduto {

    ProductView productView = new ProductView();

    public void cadastrar(){
        DTOProduct product = productView.novoProduto();

        listaDeProdutos.save(new Product("Teste", 10));
        listaDeProdutos.save(new Product("Computador", 3000));
    }


}
