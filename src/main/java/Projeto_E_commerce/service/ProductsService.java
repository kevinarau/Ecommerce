package Projeto_E_commerce.service;

import Projeto_E_commerce.dto.ProductsDto;

import Projeto_E_commerce.model.Products;



import Projeto_E_commerce.repository.ProductsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsService {


    @Autowired
    private ProductsRespository productsRespository;






    @Transactional
    public Products insertProduct(Long id, ProductsDto produto) {

        if (productsRespository.findById(id).isPresent()) {
            throw new IllegalStateException("Produto com o ID já existe.");
        }
            Products products = new Products();

            products.setName(produto.getName());
            products.setDescription(produto.getDescription());
            products.setPrice(produto.getPrice());

       return productsRespository.save(products);
    }




   @Transactional(readOnly = true)
    public List<ProductsDto> productsDtoList(Long listId){
             List<Products> products = productsRespository.searchByList(listId);
           return  products.stream()
                          .map(x-> new ProductsDto(x))
                            .toList();
    }


    @Transactional(readOnly = true)
    public List<Products> products(){
        return productsRespository.findAll();
    }

    public Products UpdateProduct(Long id, ProductsDto productsDto) {
        if (productsRespository.findById(id).isPresent()) {
               throw  new IllegalStateException("Esse produto não existe!");
        }
           Products products = productsRespository.findById(id).get();
               products.setName(productsDto.getName());
                  products.setDescription(productsDto.getDescription());
                      products.setPrice(productsDto.getPrice());

             return productsRespository.save(products);

    }


    public Products DeleteProduct(Long id){
            productsRespository.deleteById(id);
        return null;
    }


}

