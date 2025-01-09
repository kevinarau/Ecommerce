package Projeto_E_commerce.controller;


import Projeto_E_commerce.service.UserService;
import Projeto_E_commerce.dto.ProductsDto;
import Projeto_E_commerce.dto.UserDto;
import Projeto_E_commerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserControlle {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<UserDto> listUser() {
        return userService.ListaUser();
    }

    @GetMapping("/{UserId}")
    public ResponseEntity<List<ProductsDto>> ListaCliente(@PathVariable Long UserId) {
        List<ProductsDto> productsDtos = userService.UserProducts(UserId);
        return ResponseEntity.ok(productsDtos);
    }

    @PostMapping("/{id}")
    public ResponseEntity<User> CreateUser(@PathVariable Long id, @RequestBody UserDto form) {
        return ResponseEntity.ok(userService.createUser(id, form));

    }


}
