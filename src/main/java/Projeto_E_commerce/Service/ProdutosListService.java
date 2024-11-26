package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ProdutosListaDto;
import Projeto_E_commerce.model.ProdutosLista;
import Projeto_E_commerce.repository.ProdutosListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutosListService {

    @Autowired
    private ProdutosListRepository produtosListRepository;


    @Transactional(readOnly = true)
    public List<ProdutosListaDto> ListaProdutosDto() {
        List<ProdutosLista> Lista = produtosListRepository.findAll();
        return Lista.stream().map(x -> new ProdutosListaDto(x)).toList();


    }


}
