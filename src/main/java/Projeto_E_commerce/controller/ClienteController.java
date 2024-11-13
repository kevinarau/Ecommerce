package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.ClienteService;

import Projeto_E_commerce.dto.ClienteDto;
import Projeto_E_commerce.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
   private ClienteService clienteService;


  @GetMapping("/list")
    public List<ClienteDto> listaCliente (){
      List<ClienteDto> clienteDtos = clienteService.ListaCliente();
      return clienteDtos;
  }

  @PostMapping
    public ResponseEntity<Cliente> CriarCliente(@RequestBody ClienteDto form){
      return ResponseEntity.ok(clienteService.CriarCliente(form));

  }


}
