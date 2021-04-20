package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.products.Collection;
import ru.a_ves.ms_rri.services.CollectionService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collection")
public class CollectionController {

    private final CollectionService service;

    public CollectionController(CollectionService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Collection> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Collection getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public Collection add(@RequestBody Collection collection) {
        return service.save(collection);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Collection collection) {
        service.delete(collection);
    }
}
