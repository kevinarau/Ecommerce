package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProdutoController {

    @Autowired
    public ProdutosService produtosService;


    @PostMapping
    public ResponseEntity<Produtos> InserirProduto(@RequestBody ProdutosDto prod) {
        Produtos produtos = produtosService.inserirProdutos(prod);
        return ResponseEntity.ok(produtos);

    }
    @GetMapping("/{Id}")
    public List<ProdutosDto> Lista(@PathVariable Long Id) {
        return produtosService.produtosDtoList(Id);
    }

    @GetMapping("/list")
    public List<Produtos> produtos(){
        return produtosService.produtos();
    }


}
