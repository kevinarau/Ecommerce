package Projeto_E_commerce.dto;





import Projeto_E_commerce.model.User;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Service;


@Data
@NoArgsConstructor
@Service
public class UserDto {

    @Id
    private Long id;

     @NotEmpty(message = "o campo obrigatorio")
     @Size(min = 5,max = 100, message = "o campo tem que ter de 5 á 100 caracteres")
    private String name;

     @NotBlank(message = " O campo obrigatorio!")
    private String contato;

     @NotEmpty(message = "E-mail obrigatorio!")
    private String email;

    @CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;


    public UserDto(User userDto) {
       this.id = userDto.getIdUser();
       this.name = userDto.getName();
       this.contato = userDto.getContact();
       this.email = userDto.getEmail();
       this.cpf = userDto.getCpf();
    }
}
