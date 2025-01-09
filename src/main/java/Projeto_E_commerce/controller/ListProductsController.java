package Projeto_E_commerce.controller;

import Projeto_E_commerce.service.ProductsListService;
import Projeto_E_commerce.service.ProductsService;
import Projeto_E_commerce.dto.ProductsDto;
import Projeto_E_commerce.dto.ProductsListDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/section")
public class ListProductsController {


    @Autowired
    private ProductsListService productsListService;

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public List<ProductsListDto> listProducts() {
          return productsListService.ListProducts();
    }

    @GetMapping("/{listId}/prod")
    public ResponseEntity<List<ProductsDto>> products(@PathVariable Long listId) {
        List<ProductsDto> productsDtos = productsService.productsDtoList(listId);
        return ResponseEntity.ok(productsDtos);
    }



}





