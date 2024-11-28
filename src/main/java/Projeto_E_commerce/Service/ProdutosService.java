package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosList;
import Projeto_E_commerce.model.form.ItemPedidos;
import Projeto_E_commerce.projection.ProjetoProdutos;
import Projeto_E_commerce.repository.ProdutosListRepository;
import Projeto_E_commerce.repository.ProdutosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {


    @Autowired
    private ProdutosRespository produtosRespository;



    public Produtos insertProducts( ProdutosDto produtosDto) {
        Produtos produto = new Produtos();

        produto.setId(produtosDto.getId());
        produto.setName(produtosDto.getName());
        produto.setDescricao(produtosDto.getDescricao());
        produto.setPreco(produtosDto.getPreco());
        return  produtosRespository.save(produto);

    }

    @Transactional(readOnly = true)
    public List<ProdutosDto> productsDtoList(Long listId){
        List<ProjetoProdutos> produtos = produtosRespository.searchByList(listId);
        return  produtos.stream().map(x -> new ProdutosDto(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<Produtos> produtos(){
        return produtosRespository.findAll();
    }

    public Produtos UpdateProduct(Long id, ProdutosDto produtosDto){
        Optional<Produtos> products = produtosRespository.findById(id);
        if (products.isPresent()){
            Produtos prod = products.get();
            prod.setDescricao(produtosDto.getDescricao());
            prod.setPreco(produtosDto.getPreco());
            produtosRespository.save(prod);
        }
        return produtosRespository.save(products.get());

    }

    public Produtos DeleteProduct(Long id){
            produtosRespository.deleteById(id);
        return null;
    }


}

