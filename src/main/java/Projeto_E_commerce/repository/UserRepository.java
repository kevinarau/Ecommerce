package Projeto_E_commerce.repository;


import Projeto_E_commerce.model.User;
import Projeto_E_commerce.projection.ProjectProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    /*@Query(nativeQuery = true, value = """
               SELECT   pro.name AS  name,
                          pro.description AS description,
                            pro.preco AS preco,
                              en.amount AS amount
            FROM lista_cliente en
            INNER JOIN customer cl ON en.cliente_id = cl.cliente_id
                INNER JOIN lista_produto p ON p.id_produtos_lista = en.produtos_id
                     INNER JOIN products pro ON pro.lista_id = p.id_produtos_lista
                WHERE cl.cliente_id = :clienteId
             GROUP BY cl.name,en.amount,pro.name,pro.description,pro.preco;
            """)
    public List<ProjectProducts> productSelected(@Param("clienteId") Long clienteId);*/

}

