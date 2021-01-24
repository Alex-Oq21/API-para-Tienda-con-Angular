package com.tienda.backend.persistence.mapper;

import com.tienda.backend.domain.Producto;
import com.tienda.backend.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mappings({
            @Mapping(source = "idProduct", target = "productoId"),
            @Mapping(source = "image", target = "imagen"),
            @Mapping(source="title", target = "titulo"),
            @Mapping(source = "price", target = "precio"),
            @Mapping(source = "description", target = "descripcion")
    })
    Producto aProducto(Product product);
    
    @InheritInverseConfiguration
    Product toProduct(Producto producto);
}
