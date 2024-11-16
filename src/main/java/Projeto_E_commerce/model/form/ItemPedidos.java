package Projeto_E_commerce.model.form;

import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_ItemPedidos")
public class ItemPedidos {


    @EmbeddedId
    private ItemPK Id = new ItemPK();

    private int quantidade;

    private double descontos;



    public ItemPedidos(Cliente cliente , ProdutosList produtos, double descontos, int quantidade) {
        Id.setCliente(cliente);
        Id.setProdutos(produtos);
        this.descontos = descontos;
        this.quantidade = quantidade;
    }


}
