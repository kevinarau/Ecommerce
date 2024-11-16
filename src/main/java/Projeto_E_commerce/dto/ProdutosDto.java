package Projeto_E_commerce.dto;


import org.springframework.stereotype.Service;

@Service
public class ProdutosDto {

    private Long id;
    private String name;
    private String descricao;
    private double preco;


    public ProdutosDto(String descricao, Long id, String name, double preco) {
        this.descricao = descricao;
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
