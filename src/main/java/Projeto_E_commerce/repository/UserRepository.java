package Projeto_E_commerce.repository;



import Projeto_E_commerce.projection.ProjectProducts;
import Projeto_E_commerce.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Query(nativeQuery = true, value = """
               SELECT   pro.name AS  name,
                          pro.description AS description,
                            pro.price AS price,
                            en.amount AS amount
            FROM list_User en
             INNER JOIN user u ON en.user_id = u.id_user
             INNER JOIN products pro ON pro.id_product = en.products_id
              WHERE u.id_user = :UserId
             GROUP BY u.name,pro.name,en.amount,pro.description,pro.price;
            """)
    List<ProjectProducts> productSelected(@Param("UserId") Long UserId);

}

