package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProdutosListService;
import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.dto.ProdutosListaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/section")
public class CategoriasProdutosController {


    @Autowired
    private ProdutosListService produtosListService;

    @Autowired
    private ProdutosService produtosService;

    @GetMapping
    public List<ProdutosListaDto> listaProdutosDto() {
        return produtosListService.ListaProdutos();
    }

    @GetMapping("/{listId}/prod")
    public ResponseEntity<List<ProdutosDto>> produtos(@PathVariable Long listId) {
        List<ProdutosDto> produtosDtos = produtosService.produtosDtoList(listId);
        return ResponseEntity.ok(produtosDtos);
    }



}





