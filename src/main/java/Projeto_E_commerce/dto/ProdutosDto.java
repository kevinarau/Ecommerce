package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.Produtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class ProdutosDto {
    private Long id;

    private String titulo;

    private String descricao;

    private double preco;


    public ProdutosDto(Produtos produtos) {
        this.id = produtos.getId();
        this.descricao = produtos.getDescricao();
        this.preco = produtos.getPreco();
        this.titulo = produtos.getTitulo();
    }

}
