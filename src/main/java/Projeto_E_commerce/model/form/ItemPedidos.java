package Projeto_E_commerce.model.form;

import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosLista;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_Item_Pedidos")
public class ItemPedidos {


    @EmbeddedId
    private ItemPK Id = new ItemPK();

    private int quantidade;





    public ItemPedidos(Produtos produtos, ProdutosLista produtosLista , int quantidade) {
        Id.setProdutosLista(produtosLista);
        Id.setProdutos(produtos);
        this.quantidade = quantidade;
    }


}
