package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoControle {

    @Autowired
    public ProdutosService produtosService;



    @PostMapping
    public ResponseEntity<Produtos> InserirProduto(@RequestBody ProdutosDto prod) {
        Produtos produtos = produtosService.inserirProdutos(prod);
        return ResponseEntity.ok(produtos);

    }





}
