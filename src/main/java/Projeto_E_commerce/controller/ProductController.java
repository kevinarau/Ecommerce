package Projeto_E_commerce.controller;

import Projeto_E_commerce.Service.ProductsService;
import Projeto_E_commerce.dto.ProductsDto;

import Projeto_E_commerce.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductsService productsService;


   @GetMapping("/{Id}")
    public List<ProductsDto> Lista(@PathVariable Long Id) {
        return productsService.productsDtoList(Id);
    }

    @GetMapping
    public List<Products> products(){
        return productsService.products();
    }

    @PostMapping("/{id}")
    public ResponseEntity<Products> InsertProduct(@PathVariable Long id, @RequestBody ProductsDto produto)  {
        return ResponseEntity.ok(productsService.insertProduct(id, produto));

    }


    @PutMapping("/{id}")
    public ResponseEntity<Products> UpdateProduct(@PathVariable Long id, @RequestBody ProductsDto productsDto){
      Products products = productsService.UpdateProduct(id, productsDto);
      return  ResponseEntity.ok(products);
    }


    @DeleteMapping("/{id}")
    public Products delete(@PathVariable Long id){
       return productsService.DeleteProduct(id);
    }

}
