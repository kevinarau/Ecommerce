package Projeto_E_commerce.model.form;




import Projeto_E_commerce.model.Products;
import Projeto_E_commerce.model.ProductsList;
import Projeto_E_commerce.model.User;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "list_User")
public class OrdersList {




    @EmbeddedId
    private Pk_User_Lista Idpk = new Pk_User_Lista();



    private int amount;


    public OrdersList() {
    }

    public OrdersList(Products products, User user, ProductsList productsList, int amount) {
        Idpk.setUser(user);
        Idpk.setProductsList(productsList);
        Idpk.setProducts(products);
        this.amount = amount;
    }

    public Pk_User_Lista getId() {
        return Idpk;
    }

    public void setId(Pk_User_Lista idpk) {
        Idpk = idpk;
    }


}
