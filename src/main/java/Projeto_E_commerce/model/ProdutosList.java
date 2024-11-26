package Projeto_E_commerce.model;

import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "tb_lista_produtos")
public class ProdutosList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public ProdutosList() {
    }

    public ProdutosList(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

