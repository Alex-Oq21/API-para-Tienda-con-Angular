package com.tienda.backend.persistence.crud;

import com.tienda.backend.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
       
}
