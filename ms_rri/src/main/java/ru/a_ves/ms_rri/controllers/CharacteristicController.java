package ru.a_ves.ms_rri.controllers;

import org.springframework.web.bind.annotation.*;
import ru.a_ves.ms_core.model.dictionaries.Characteristic;
import ru.a_ves.ms_rri.services.CharacteristicService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dictionary/characteristic")
public class CharacteristicController {
    private final CharacteristicService service;

    public CharacteristicController(CharacteristicService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Characteristic> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Characteristic getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/add")
    public Characteristic add(@RequestBody Characteristic characteristic) {
        return service.save(characteristic);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Characteristic characteristic) {
        service.delete(characteristic);
    }
}
