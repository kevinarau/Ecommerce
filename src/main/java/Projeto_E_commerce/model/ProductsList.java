package Projeto_E_commerce.model;

import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "list_Products")
public class ProductsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLista;

    private String name;

    public ProductsList() {
    }
    public ProductsList(Long id, String name) {
        this.idLista = id;
        this.name = name;
    }


}


