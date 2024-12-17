package Projeto_E_commerce.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @JoinColumn(unique = true)
    private String name;
    private String description;
    private double price;



    public Products() {
    }



}
