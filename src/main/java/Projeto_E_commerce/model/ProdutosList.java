package Projeto_E_commerce.model;

import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "lista_produto")
public class ProdutosList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProdutosLista;

    private String name;

    public ProdutosList() {
    }
    public ProdutosList(Long id, String name) {
        this.idProdutosLista = id;
        this.name = name;
    }


}


