package Projeto_E_commerce.controller;


import Projeto_E_commerce.Service.PedidosService;
import Projeto_E_commerce.dto.PedidosDto;
import Projeto_E_commerce.model.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

  @PostMapping
    public ResponseEntity<Pedidos> placeOrders(@RequestBody PedidosDto pedidosDto){
      return ResponseEntity.ok( pedidosService.placeOrders(pedidosDto));
  }

}
