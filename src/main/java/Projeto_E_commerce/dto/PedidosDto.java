package Projeto_E_commerce.dto;

import Projeto_E_commerce.model.Pedidos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class PedidosDto {

    private  Long clienteid;

    private LocalDateTime dataPedidos = LocalDateTime.now();

    public PedidosDto() {
    }

    public PedidosDto(Pedidos pedidos) {
        this.clienteid = pedidos.getId();
        this.dataPedidos = getDataPedidos();
    }


}
