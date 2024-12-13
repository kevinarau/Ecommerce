package Projeto_E_commerce.repository;

import Projeto_E_commerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


    @Query(nativeQuery = true, value = """
 ("SELECT COUNT(*) AS 'CLIENTE',
                      CL.NAME,
                      P.NAME ,
                      EN.QUANTIDADE
    FROM CLIENTE CL
         INNER JOIN LISTA_CLIENTE EN
    ON CL.ID_CLIENTE = EN.CLIENTE_ID
           INNER JOIN LISTA_PRODUTO TL
    ON TL.ID_PRODUTOS_LISTA = EN.PRODUTOS_ID
           INNER JOIN PRODUTOS P ON P.LISTA_ID = TL.ID_PRODUTOS_LISTA
           WHERE ip.produtos_id = :idprod
    GROUP BY CL.NAME,P.NAME,EN.QUANTIDADE"
   """)
    public Cliente  productSelected(Long idprod);
}
