package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Cliente;
import Projeto_E_commerce.model.ProdutosList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosListRepository extends JpaRepository<ProdutosList,Long> {


}
