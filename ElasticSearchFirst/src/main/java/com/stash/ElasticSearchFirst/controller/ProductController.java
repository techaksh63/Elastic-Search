package com.stash.ElasticSearchFirst.controller;

import com.stash.ElasticSearchFirst.entity.Product;
import com.stash.ElasticSearchFirst.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {

    @Autowired
    private ProductService  productService;
    @GetMapping("/findAll")
    Iterable<Product> findAll(){
       return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product){
       return productService.insertProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int id){
        return productService.updateProduct(product,id);
    }
}
