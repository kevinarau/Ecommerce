package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Products;
import Projeto_E_commerce.projection.ProjectProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRespository extends JpaRepository<Products, Long> {

  /*  @Query(nativeQuery = true, value = """
    SELECT 
        p.id_produtos, 
        p.name, 
        p.description, 
        p.preco
        FROM lista_produto ip
    INNER JOIN products p ON p.lista_id = ip.id_produtos_lista
    WHERE ip.id_produtos_lista = :listId
    ORDER BY p.id_produtos
    """)
    List<ProjectProducts> searchByList(Long listId);*/




}
