package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.ClienteService;

import Projeto_E_commerce.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
   private ClienteService clienteService;


  //@GetMapping
   // public List<ClienteDto> listaCliente (){
    //  return clienteService.ListaCliente();
//}

}
