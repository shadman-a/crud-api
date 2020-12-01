package dev.shadmanahmed.crudapi.service;

import dev.shadmanahmed.crudapi.entity.Product;
import dev.shadmanahmed.crudapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
       return repository.save(product);
    }

    public Product saveProduct(List<Product> products){
        return repository.save(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(other:null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed !!"+id;
    }

    public Product updateProduct(Product product){
        Product exisitingProduct=repository.findById(product.getId()).orElse(other:null);
        exisitingProduct.setName(product.getName());
        exisitingProduct.setQuantity(product.getQuantity());
        exisitingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }



}
