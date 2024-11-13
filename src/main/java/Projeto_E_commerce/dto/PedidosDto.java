package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.Pedidos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Service
public class PedidosDto {

    private  Long id;

    private LocalDateTime dataPedidos = LocalDateTime.now();



    public PedidosDto(Pedidos pedidos) {
        this.id = pedidos.getId();
        this.dataPedidos = getDataPedidos();
    }


}
