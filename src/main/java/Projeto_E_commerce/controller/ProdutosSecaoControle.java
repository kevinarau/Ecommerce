package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProdutosListService;
import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.dto.ProdutosListaDto;
import Projeto_E_commerce.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/secao")
public class ProdutosSecaoControle {


    @Autowired
    private ProdutosListService produtosListService;

    @Autowired
    private ProdutosService produtosService;

    @GetMapping
    public List<ProdutosListaDto> listaProdutosDto() {
        return produtosListService.ListaProdutosDto();
    }

    @GetMapping("/{listId}/prod")
    public List<ProdutosDto> produtos(@PathVariable Long listId) {
        return produtosService.ListaProdutos(listId);
    }


}





