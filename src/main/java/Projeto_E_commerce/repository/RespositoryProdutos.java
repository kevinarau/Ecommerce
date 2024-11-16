package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespositoryProdutos extends JpaRepository<Produtos,Long> {
}
