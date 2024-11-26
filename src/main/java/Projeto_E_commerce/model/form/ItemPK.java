package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemPK {

    @ManyToOne
    @JoinColumn(name = "id_produtos")
    private Produtos produtos;
    @ManyToOne
    @JoinColumn(name = "produtos_lista_id")
    private ProdutosList produtosList;

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public ProdutosList getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(ProdutosList produtosList) {
        this.produtosList = produtosList;
    }
}
