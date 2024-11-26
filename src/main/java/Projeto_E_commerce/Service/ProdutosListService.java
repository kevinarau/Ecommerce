package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ProdutosListaDto;
import Projeto_E_commerce.model.ProdutosList;
import Projeto_E_commerce.repository.ProdutosListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosListService {

    @Autowired
    private ProdutosListRepository produtosListRepository;


    public List<ProdutosListaDto> ListaProdutos() {
        List<ProdutosList> produtosLists = produtosListRepository.findAll();
        List<ProdutosListaDto> list = produtosLists.stream().map(x -> new ProdutosListaDto(x)).toList();
        return list;

    }

}

