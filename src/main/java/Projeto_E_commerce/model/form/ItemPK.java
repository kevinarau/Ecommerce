package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemPK {

    @ManyToOne
    @JoinColumn(name =  "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name =  "produtos_id")
    private ProdutosList produtos;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ProdutosList getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutosList produtos) {
        this.produtos = produtos;
    }
}
