package com.tienda.backend.persistence;

import com.tienda.backend.persistence.crud.ProductoCrudRepository;
import com.tienda.backend.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
