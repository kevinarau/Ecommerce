package Projeto_E_commerce.dto;



import Projeto_E_commerce.projection.ProjectProducts;
import Projeto_E_commerce.model.Products;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ProductsDto {


    @Id
    private Long id;

    @NotEmpty(message = "o campo obrigatorio")
    @Size(min = 5, max = 100, message = "o campo tem que ter de 5 á 100 caracteres")
    private String name;

    @NotEmpty(message = "o campo obrigatorio")
    @Size(min = 5, max = 100, message = "o campo tem que ter de 5 á 100 caracteres")
    private String description;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    private double price;

    private int amount;

    public ProductsDto() {
    }

    public ProductsDto(ProjectProducts products) {
        this.name = products.getName();
        this.description = products.getDescription();
        this.price = products.getPrice();
        this.amount = products.getAmount();
    }

    public ProductsDto(Products prod) {
        this.id = prod.getIdProduct();
        this.description = prod.getDescription();
        this.name = prod.getName();
        this.price = prod.getPrice();

    }






}
