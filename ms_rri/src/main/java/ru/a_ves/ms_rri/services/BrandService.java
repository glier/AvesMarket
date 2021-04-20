package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.model.products.characteristics.Brand;
import ru.a_ves.ms_rri.repositories.BrandRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    private final BrandRepository repository;

    public BrandService(BrandRepository brandRepository) {
        this.repository = brandRepository;
    }

    public void save(Brand brand) {
        brand.setName(brand.getName().trim());
        repository.save(brand);
    }

    public List<Brand> getAll() {
        return repository.findAll();
    }

    public Optional<Brand> get(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
