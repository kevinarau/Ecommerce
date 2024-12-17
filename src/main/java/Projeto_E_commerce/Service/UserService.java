package Projeto_E_commerce.Service;

import Projeto_E_commerce.dto.UserDto;
import Projeto_E_commerce.model.User;
import Projeto_E_commerce.repository.UserRepository;
import Projeto_E_commerce.repository.ProductsListRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private ProductsListRepository productsListRepository;


    public User createUser(Long id, UserDto userDto) {
        if (userRepository.findById(id).isPresent()) {
            throw new IllegalStateException("Usuário com o ID já existe.");
        }
        User user = new User();
        user.setIdUser(id);
        user.setName(userDto.getName());
        user.setCpf(userDto.getCpf());
        user.setContact(userDto.getContato());
        user.setEmail(userDto.getEmail());

        return userRepository.save(user);
    }


    public void updateUser(Long id, UserDto form) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com o ID: " + id));

        if (form.getContato() != null) user.setContact(form.getContato());
        if (form.getEmail() != null) user.setEmail(form.getEmail());
        if (form.getName() != null) user.setName(form.getName());


        userRepository.save(user);
    }


    public List<UserDto> ListaUser() {
        List<User> forms = userRepository.findAll();
        return forms.stream()
                .map(UserDto::new)
                .toList();


    }

    public User buscarUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com o ID: " + id));
    }


  /*  @Transactional(readOnly = true)
    public List<ProductsDto> UserProducts(Long idprod) {
        List<ProjectProducts> products = userRepository.productSelected(idprod);
        if (products == null || products.isEmpty()) {
            return List.of();
        }
      return products.stream()
             .map(ProductsDto::new)
           .toList();
    }*/


}
