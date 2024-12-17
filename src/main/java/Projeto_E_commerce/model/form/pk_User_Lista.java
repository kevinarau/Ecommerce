package Projeto_E_commerce.model.form;


import Projeto_E_commerce.model.Products;
import Projeto_E_commerce.model.ProductsList;
import Projeto_E_commerce.model.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class pk_User_Lista {

    @ManyToOne
    @JoinColumn (name =  "list_id")
    private ProductsList productsList;

    @ManyToOne
    @JoinColumn (name = "User_id")
     private User user;

    @ManyToOne
    @JoinColumn (name = "products_id")
    private Products products;

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public ProductsList getProductsList() {
        return productsList;
    }

    public void setProductsList(ProductsList productsList) {
        this.productsList = productsList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pk_User_Lista that = (pk_User_Lista) o;
        return Objects.equals(productsList, that.productsList) && Objects.equals(user, that.user) && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsList, user, products);
    }
}
