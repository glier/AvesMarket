package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.products.Product;
import ru.a_ves.ms_rri.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private static final String NOT_FOUND_BY_ID = "Product by id: %d Not Found";
    private final ProductRepository repository;

    public ProductService(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product get(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(Product product) {
        repository.delete(product);
    }
}
