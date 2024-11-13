package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.PedidosDto;
import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Pedidos;
import Projeto_E_commerce.repository.ClienteRepository;
import Projeto_E_commerce.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;



@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public Pedidos placeOrders(PedidosDto pedidosDto) {
        Pedidos pedidos = new Pedidos();
        if (pedidos == null) {
            Cliente cliente = clienteRepository.findById(pedidosDto.getId()).get();
            pedidos.setCliente(cliente);
            pedidos.setDataPedidos(pedidosDto.getDataPedidos());

            pedidosRepository.save(pedidos);

        }
 return pedidos;
    }
}
