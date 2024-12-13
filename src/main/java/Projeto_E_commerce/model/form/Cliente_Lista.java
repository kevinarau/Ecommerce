package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.ProdutosList;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "lista_cliente")
public class Cliente_Lista {




    @EmbeddedId
    private pk_Cliente_Lista Idpk = new pk_Cliente_Lista();



    private int quantidade;


    public Cliente_Lista() {
    }

    public Cliente_Lista(Cliente cliente , ProdutosList produtosList,  int quantidade) {
        Idpk.setCliente(cliente);
        Idpk.setProdutosList(produtosList);
        this.quantidade = quantidade;
    }

    public pk_Cliente_Lista getId() {
        return Idpk;
    }

    public void setId(pk_Cliente_Lista idpk) {
        Idpk = idpk;
    }


}
