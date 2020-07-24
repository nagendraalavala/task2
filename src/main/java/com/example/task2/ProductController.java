package com.example.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", headers = "Accept=application/json")
public class ProductController
{
    @Autowired
    private ProductService service;

    @PostMapping("/add")
    public ProductEntity addProduct(@RequestBody ProductEntity productEntity)
    {
        return service.postProduct(productEntity);
    }
}
