package Projeto_E_commerce.model;

import jakarta.persistence.*;

import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "tb_lista_produtos")
public class ProdutosLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public ProdutosLista() {
    }

    public ProdutosLista(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

