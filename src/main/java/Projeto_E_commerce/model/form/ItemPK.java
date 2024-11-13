package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Pedidos;
import Projeto_E_commerce.model.Produtos;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemPK {

    @ManyToOne
    @JoinColumn(name =  "pedidos_id")
    private Pedidos pedidos;
    @ManyToOne
    @JoinColumn(name =  "produtos_id")
    private Produtos produtos;



    public Pedidos getPedidos() {
        return pedidos;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

}
