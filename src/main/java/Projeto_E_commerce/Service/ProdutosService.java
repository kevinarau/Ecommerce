package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.ProdutosDto;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.repository.ProdutosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {



    @Autowired
    private ProdutosRespository produtosRespository;

    public Produtos inserirProdutos(ProdutosDto produtosDto){
       Produtos prod = new Produtos();
           prod.setNome(produtosDto.getName());
           prod.setDescricao(produtosDto.getDescricao());
           prod.setPreco(produtosDto.getPreco());

         return  produtosRespository.save(prod);

       }

       public List<Produtos> listaProdutos(){
        return produtosRespository.findAll();
       }








}
