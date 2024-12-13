package Projeto_E_commerce.model.form;

import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class pk_Cliente_Lista {

    @ManyToOne
    @JoinColumn (name =  "produtos_id")
    private ProdutosList produtosList;

    @ManyToOne
    @JoinColumn (name = "cliente_id")
     private Cliente cliente;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ProdutosList getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(ProdutosList produtosList) {
        this.produtosList = produtosList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pk_Cliente_Lista that = (pk_Cliente_Lista) o;
        return Objects.equals(produtosList, that.produtosList) && Objects.equals(cliente, that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtosList, cliente);
    }
}
