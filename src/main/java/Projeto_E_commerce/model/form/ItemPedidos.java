package Projeto_E_commerce.model.form;

import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.model.ProdutosList;
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


    public ItemPedidos(Produtos produtos, ProdutosList produtosLista, int quantidade) {
        Id.setProdutosList(produtosLista);
        Id.setProdutos(produtos);
        this.quantidade = quantidade;
    }


}
