package Projeto_E_commerce.model.form;

import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.Pedidos;
import Projeto_E_commerce.model.Produtos;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_ItemPedidos")
public class ItemPedidos {


    @EmbeddedId
    private ItemPK Id = new ItemPK();

    private int quantidade;

    private double descontos;



    public ItemPedidos( Pedidos pedidos, Produtos produtos, double descontos, int quantidade) {
        Id.setPedidos(pedidos);
        Id.setProdutos(produtos);
        this.descontos = descontos;
        this.quantidade = quantidade;
    }


}
