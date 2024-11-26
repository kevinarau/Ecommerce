package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Produtos;
import Projeto_E_commerce.projection.ProjetoProdutos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRespository extends JpaRepository<Produtos, Long> {

	@Query(nativeQuery = true, value = """
    SELECT 
        p.id, 
        p.name, 
        p.descricao, 
        p.preco,
        ip.quantidade
    FROM tb_produtos p
    INNER JOIN tb_item_pedidos ip ON p.id = ip.id_produtos
    WHERE ip.produtos_lista_id = :listId
    ORDER BY ip.quantidade 
    """)
	List<ProjetoProdutos> searchByList(Long listId);


}
