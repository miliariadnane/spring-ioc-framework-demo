package dev.nano.app;

import dev.nano.core.annotation.Component;

import java.util.List;

@Component
public interface ProductRepository {
    public default List<Product> findAllProducts() {
        return List.of(
            new Product("1", "Product 1", "Description 1", 1.0),
            new Product("2", "Product 2", "Description 2", 2.0),
            new Product("3", "Product 3", "Description 3", 3.0)
        );
    }
}
