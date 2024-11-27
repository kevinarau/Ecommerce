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
public class ProductController {

    @Autowired
    public ProdutosService produtosService;


    @GetMapping("/{Id}")
    public List<ProdutosDto> Lista(@PathVariable Long Id) {
        return produtosService.productsDtoList(Id);
    }

    @PostMapping
    public ResponseEntity<Produtos> InsertProduct(Long id,@RequestBody ProdutosDto prod) {
        Produtos produtos = produtosService.insertProducts(id, prod);
        return ResponseEntity.ok(produtos);

    }

    @GetMapping
    public List<Produtos> produtos(){
        return produtosService.produtos();
    }

  @PutMapping("/{id}")
    public ResponseEntity<Produtos> UpdateProduct(@PathVariable Long id, @RequestBody ProdutosDto produtosDto){
      Produtos produtos = produtosService.UpdateProduct(id, produtosDto);
      return  ResponseEntity.ok(produtos);
    }



}
