package Projeto_E_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProdutos;

    @JoinColumn(unique = true)
    private String name;
    private String descricao;
    private double preco;

    @ManyToOne
    @JoinColumn (name = "lista_id")
     private  ProdutosList produtos;


    public Produtos() {
    }



}
