package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRespository extends JpaRepository<Products, Long> {

   @Query(nativeQuery = true, value = """
    SELECT 
        p.id_product, 
        p.name, 
        p.description, 
        p.price
        
        FROM list_products ip
    INNER JOIN products p ON p.id_product = ip.id_lista
    WHERE ip.id_lista = :listId
    ORDER BY p.id_product
    """)
    List<Products> searchByList(Long listId);




}
