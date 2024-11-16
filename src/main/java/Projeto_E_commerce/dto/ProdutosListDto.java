package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class ProdutosDto {
    @Id
    private Long id;

    private String name;

    public ProdutosDto(ProdutosList produtos) {
        this.id = produtos.getId();
       this.name = produtos.getName();
    }

}
