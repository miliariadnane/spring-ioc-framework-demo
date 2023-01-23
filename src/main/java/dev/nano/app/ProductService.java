package dev.nano.app;

import dev.nano.core.annotation.Component;

import java.util.List;

@Component
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
