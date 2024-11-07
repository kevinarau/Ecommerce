package Projeto_E_commerce.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteForm {
    private Long id;

    private String name;

    private String contato;

    private String email;

    private String cpf;

}
