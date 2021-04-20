package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.products.ProductProperties;
import ru.a_ves.ms_rri.repositories.ProductPropertiesRepository;

import java.util.List;

@Service
public class ProductPropertiesService {
    private static final String NOT_FOUND_BY_ID = "Characteristic by id: %d Not Found";

    private final ProductPropertiesRepository repository;

    public ProductPropertiesService(ProductPropertiesRepository productPropertiesRepository) {
        this.repository = productPropertiesRepository;
    }

    public ProductProperties save(ProductProperties productProperties) {
        return repository.save(productProperties);
    }

    public List<ProductProperties> getAll() {
        return repository.findAll();
    }

    public ProductProperties get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(ProductProperties productProperties) {
        repository.delete(productProperties);
    }
}
