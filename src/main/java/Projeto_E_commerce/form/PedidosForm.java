package Projeto_E_commerce.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidosForm {

    private  Long clienteid;

    private LocalDateTime dataPedidos = LocalDateTime.now();
}
