package Projeto_E_commerce.Service.dto;

import Projeto_E_commerce.Service.ProdutosService;
import Projeto_E_commerce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutosImple implements ProdutosService {
    @Autowired
    private ProdutosRepository produtosRepository;
}
