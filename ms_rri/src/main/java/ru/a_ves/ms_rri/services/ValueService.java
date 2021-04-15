package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.products.characteristics.Value;
import ru.a_ves.ms_rri.repositories.ValueRepository;

import java.util.List;

@Service
public class ValueService {
    private static final String NOT_FOUND_BY_ID = "Value by id: %d Not Found";

    private final ValueRepository repository;

    public ValueService(ValueRepository valueRepository) {
        this.repository = valueRepository;
    }

    public Value save(Value value) {
        value.setName(value.getName().trim());
        return repository.save(value);
    }

    public List<Value> getAll() {
        return repository.findAll();
    }

    public Value get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(Value value) {
        repository.delete(value);
    }
}
