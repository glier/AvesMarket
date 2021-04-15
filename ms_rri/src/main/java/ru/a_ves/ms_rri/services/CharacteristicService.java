package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.dictionaries.Characteristic;
import ru.a_ves.ms_rri.repositories.CharacteristicRepository;

import java.util.List;

@Service
public class CharacteristicService {
    private static final String NOT_FOUND_BY_ID = "CharacteristicDict by id: %d Not Found";

    private final CharacteristicRepository repository;

    public CharacteristicService(CharacteristicRepository repository) {
        this.repository = repository;
    }

    public Characteristic save(Characteristic characteristic) {
        characteristic.setName(characteristic.getName().trim());
        return repository.save(characteristic);
    }

    public List<Characteristic> getAll() {
        return repository.findAll();
    }

    public Characteristic get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(Characteristic characteristic) {
        repository.delete(characteristic);
    }
}
