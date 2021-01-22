package com.tienda.backend.persistence;

import com.tienda.backend.persistence.crud.ProductoCrudRepository;
import com.tienda.backend.persistence.entity.Producto;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
