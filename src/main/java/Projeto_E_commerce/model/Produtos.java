package Projeto_E_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_Produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(name = "tb_preco",unique = true)
    private double preco;

    private  String descricao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cliente_id")
    private Cliente cliente;


    }

