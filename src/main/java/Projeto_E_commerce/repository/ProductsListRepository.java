package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.ProductsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsListRepository extends JpaRepository<ProductsList,Long> {



}
