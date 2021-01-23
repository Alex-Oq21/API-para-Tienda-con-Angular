package com.tienda.backend.persistence;

import com.tienda.backend.persistence.crud.ProductoCrudRepository;
import com.tienda.backend.persistence.entity.Product;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productoCrudRepository.findAll();
    }

    public Product save(Product product){
        return productoCrudRepository.save(product);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
