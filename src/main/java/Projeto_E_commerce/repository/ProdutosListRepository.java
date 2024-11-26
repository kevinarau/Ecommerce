package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.ProdutosLista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosListRepository extends JpaRepository<ProdutosLista, Long> {
}
