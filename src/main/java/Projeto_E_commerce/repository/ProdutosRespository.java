package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.projection.ProjetoProdutos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProdutosRespository extends JpaRepository<Produtos, Long> {

    @Query(nativeQuery = true, value = """
    SELECT 
        p.id_produtos, 
        p.name, 
        p.descricao, 
        p.preco
        FROM produtos p
    INNER JOIN lista_produto ip ON p.lista_id = ip.id_produtos_lista
    WHERE ip.id_produtos_lista = :listId
    ORDER BY p.id_produtos
    """)
    List<ProjetoProdutos> searchByList(Long listId);



}
