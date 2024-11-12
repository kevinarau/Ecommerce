package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.Produtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProdutosDto {
    private Long clienteid;

    private String titulo;

    private String descricao;

    private double preco;


    public ProdutosDto(Produtos produtos) {
        this.clienteid = produtos.getId();
        this.descricao = produtos.getDescricao();
        this.preco = produtos.getPreco();
        this.titulo = produtos.getTitulo();
    }

    public ProdutosDto() {
    }
}
