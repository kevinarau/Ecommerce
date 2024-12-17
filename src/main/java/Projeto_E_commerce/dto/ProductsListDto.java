package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.ProductsList;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class ProductsListDto {
    @Id
    private Long id;


    private String name;



    public ProductsListDto(ProductsList produtos) {
        this.id = produtos.getIdLista();
       this.name = produtos.getName();
    }

}
