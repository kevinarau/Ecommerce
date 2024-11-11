package Projeto_E_commerce.Service.dto;

import Projeto_E_commerce.Service.PedidosService;
import Projeto_E_commerce.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidosImple implements PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;
}
