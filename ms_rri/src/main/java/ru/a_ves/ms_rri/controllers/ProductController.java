package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.products.Product;
import ru.a_ves.ms_rri.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product product) {
        return service.save(product);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Product product) {
        service.delete(product);
    }
}
