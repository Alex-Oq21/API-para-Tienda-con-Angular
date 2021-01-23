package com.tienda.backend.domain.repository;

import com.tienda.backend.domain.Producto;

import java.util.List;

public interface ProductoRepository {
    List<Producto> getAll();
    Producto save(Producto producto);
    void delete(int productoId);
}
