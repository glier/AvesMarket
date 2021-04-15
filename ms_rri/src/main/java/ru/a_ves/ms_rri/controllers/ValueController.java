package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.products.characteristics.Value;
import ru.a_ves.ms_rri.services.ValueService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dictionary/value")
public class ValueController {

    private final ValueService service;

    public ValueController(ValueService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Value> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Value getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public Value add(@RequestBody Value value) {
        return service.save(value);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Value value) {
        service.delete(value);
    }
}
