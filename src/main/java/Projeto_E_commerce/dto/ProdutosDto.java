package Projeto_E_commerce.dto;


import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.projection.ProjetoProdutos;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
public class ProdutosDto {

    @Id
    private Long id;
    private String name;
    private String descricao;
    private double preco;

    public ProdutosDto() {
    }

    public ProdutosDto(Produtos prod) {
        this.descricao = prod.getDescricao();
        this.id = prod.getIdProdutos();
        this.name = prod.getName();
        this.preco = prod.getPreco();
    }


    public ProdutosDto(ProjetoProdutos produtos) {
        this.descricao = produtos.getDescricao();
        this.id = produtos.getId();
        this.name = produtos.getName();
        this.preco = produtos.getPreco();

    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
