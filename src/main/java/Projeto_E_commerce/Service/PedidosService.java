package Projeto_E_commerce.Service;

import Projeto_E_commerce.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

}
