package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.Pedidos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Service
public class PedidosDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String  dataPedidos;



    public PedidosDto(Pedidos pedidos) {
        this.id = pedidos.getId();
        this.dataPedidos = getDataPedidos();
    }


}
