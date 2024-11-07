package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;



}
