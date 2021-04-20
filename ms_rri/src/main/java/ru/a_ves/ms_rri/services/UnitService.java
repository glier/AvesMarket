package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.dictionaries.Unit;
import ru.a_ves.ms_rri.repositories.UnitRepository;

import java.util.List;

@Service
@Transactional
public class UnitService {
    private static final String NOT_FOUND_BY_ID = "Characteristic by id: %d Not Found";

    private final UnitRepository repository;

    public UnitService(UnitRepository repository) {
        this.repository = repository;
    }

    public Unit save(Unit unit) {
        unit.setName(unit.getName().trim());
        return repository.save(unit);
    }

    public List<Unit> getAll() {
        return repository.findAll();
    }

    public Unit get(Long id) throws NotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(Unit unit) {
        repository.delete(unit);
    }
}
