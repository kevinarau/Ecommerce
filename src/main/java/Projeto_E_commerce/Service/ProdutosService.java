package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.projection.ProjetoProdutos;
import Projeto_E_commerce.repository.ProdutosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {


    @Autowired
    private ProdutosRespository produtosRespository;

    public Produtos inserirProdutos(ProdutosDto produtosDto) {
        Produtos prod = new Produtos();
        prod.setDescricao(produtosDto.getDescricao());
        prod.setPreco(produtosDto.getPreco());

        return produtosRespository.save(prod);

    }

      public List<ProdutosDto> produtosDtoList(Long listId){
        List<ProjetoProdutos> produtos = produtosRespository.searchByList(listId);
        return  produtos.stream().map(x -> new ProdutosDto(x)).toList();
      }

      public List<Produtos> produtos(){
        return produtosRespository.findAll();
      }

}
