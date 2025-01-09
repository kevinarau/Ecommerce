package Projeto_E_commerce.service;

import Projeto_E_commerce.dto.ProductsListDto;
import Projeto_E_commerce.model.ProductsList;
import Projeto_E_commerce.repository.ProductsListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsListService {

    @Autowired
    private ProductsListRepository productsListRepository;


    public List<ProductsListDto> ListProducts() {
                List<ProductsList> productsLists = productsListRepository.findAll();
         return productsLists.stream()
                              .map(x -> new ProductsListDto(x))
                               .toList();
    }



}

