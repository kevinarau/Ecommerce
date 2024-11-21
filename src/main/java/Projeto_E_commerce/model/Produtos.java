package Projeto_E_commerce.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double preco;




    public Produtos() {
    }

    public Produtos(String descricao, Long id, String name, double preco) {
        this.descricao = descricao;
        this.id = id;
        this.nome = name;
        this.preco = preco;
    }
}
