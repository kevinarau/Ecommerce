package Projeto_E_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_Pedidos")
public class Pedidos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cliente_id")
    private Cliente cliente;

    private LocalDateTime dataPedidos = LocalDateTime.now();
}
