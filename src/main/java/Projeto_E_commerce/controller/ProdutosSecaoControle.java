package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProdutosListService;
import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.dto.ProdutosListaDto;
import Projeto_E_commerce.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Secao")
public class ProdutosSecaoControle {



      @Autowired
        private ProdutosListService produtosListService;

        @Autowired
        private ProdutosService produtosService;

        @GetMapping("/lista")
        public List<ProdutosListaDto> listaProdutosDto() {
            return produtosListService.ListaProdutos();
        }

        @GetMapping("/listaProdutos")
      public List<Produtos> listaProdutos(){
            return produtosService.listaProdutos();
      }



    }





