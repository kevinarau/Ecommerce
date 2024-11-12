package Projeto_E_commerce.dto;


import Projeto_E_commerce.model.Cliente;

import lombok.Data;
import org.springframework.beans.BeanUtils;


@Data
public class ClienteDto {
    private Long id;

    private String name;

    private String contato;

    private String email;

    private String cpf;

    public ClienteDto() {
    }

    public ClienteDto(Cliente cliente ) {
        BeanUtils.copyProperties(cliente, this);
    }
}
