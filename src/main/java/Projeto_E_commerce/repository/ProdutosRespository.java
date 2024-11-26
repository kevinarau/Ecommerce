package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRespository extends JpaRepository<Produtos, Long> {
}
