package Projeto_E_commerce.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
@JsonIgnoreProperties({"hibernateLazyinitializer", "handler"})
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String name;


    private String contact;

    @JoinColumn(unique = true)
    private String email;

    @JoinColumn(unique = true)
    private String cpf;



}
