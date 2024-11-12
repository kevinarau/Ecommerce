package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos,Long> {
}
