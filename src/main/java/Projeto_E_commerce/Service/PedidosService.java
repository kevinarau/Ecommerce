package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.PedidosDto;
import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Pedidos;
import Projeto_E_commerce.repository.ClienteRepository;
import Projeto_E_commerce.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public Pedidos placeOrders(Long id,PedidosDto pedidosDto) {
        Optional<Pedidos> pedidos = pedidosRepository.findById(id);
        if(pedidos.isPresent()){
            return pedidos.get();
        }else {
            Pedidos ped = new Pedidos();
            Optional<Cliente> byId = clienteRepository.findById(id);
           ped.setCliente(byId.get());
           ped.setDataPedidos(pedidosDto.getDataPedidos());
           pedidosRepository.save(ped);
           return ped;
        }

    }
}
