package com.tienda.backend.persistence.crud;

import com.tienda.backend.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Product, Integer> {
       
}
