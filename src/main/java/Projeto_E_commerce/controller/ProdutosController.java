package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;


}
