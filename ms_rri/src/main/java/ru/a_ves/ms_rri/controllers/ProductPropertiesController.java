package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.products.ProductProperties;
import ru.a_ves.ms_rri.services.ProductPropertiesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product/properties")
public class ProductPropertiesController {

    private final ProductPropertiesService service;

    public ProductPropertiesController(ProductPropertiesService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<ProductProperties> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductProperties getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public ProductProperties add(@RequestBody ProductProperties productProperties) {
        return service.save(productProperties);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ProductProperties productProperties) {
        service.delete(productProperties);
    }
}
