package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosLista;
import jakarta.persistence.*;

import java.util.List;

@Embeddable
public class ItemPK {

    @ManyToOne
    @JoinColumn(name = "id_produtos")
    private Produtos produtos;

    @ManyToOne
    @JoinColumn(name = "produtos_lista_id")
    private ProdutosLista produtosLista;

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public ProdutosLista getProdutosLista() {
        return produtosLista;
    }

    public void setProdutosLista(ProdutosLista produtosLista) {
        this.produtosLista = produtosLista;
    }
}
