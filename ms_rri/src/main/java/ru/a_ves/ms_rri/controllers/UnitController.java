package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.dictionaries.Unit;
import ru.a_ves.ms_rri.services.UnitService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dictionary/unit")
public class UnitController {

    private final UnitService service;

    public UnitController(UnitService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Unit> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Unit getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public Unit add(@RequestBody Unit unit) {
        return service.save(unit);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Unit unit) {
        service.delete(unit);
    }

}
