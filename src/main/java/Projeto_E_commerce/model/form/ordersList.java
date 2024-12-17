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
public class ordersList {




    @EmbeddedId
    private pk_User_Lista Idpk = new pk_User_Lista();



    private int amount;


    public ordersList() {
    }

    public ordersList(Products products,User user, ProductsList productsList, int amount) {
        Idpk.setUser(user);
        Idpk.setProductsList(productsList);
        Idpk.setProducts(products);
        this.amount = amount;
    }

    public pk_User_Lista getId() {
        return Idpk;
    }

    public void setId(pk_User_Lista idpk) {
        Idpk = idpk;
    }


}
