package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.ProdutosLista;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@Service
public class ProdutosListaDto {
    @Id
    private Long id;

    private String name;


    public ProdutosListaDto() {
    }

    public ProdutosListaDto( ProdutosLista prod) {
        this.id = prod.getId();
        this.name = prod.getName();
    }
}
