package ru.a_ves.ms_rri.services;

import org.springframework.stereotype.Service;
import ru.a_ves.ms_core.exceptions.NotFoundException;
import ru.a_ves.ms_core.model.products.Collection;
import ru.a_ves.ms_rri.repositories.CollectionRepository;

import java.util.List;

@Service
public class CollectionService {
    private static final String NOT_FOUND_BY_ID = "Collection by id: %d Not Found";

    private final CollectionRepository repository;

    public CollectionService(CollectionRepository repository) {
        this.repository = repository;
    }

    public Collection save(Collection collection) {
        collection.setName(collection.getName().trim());
        return repository.save(collection);
    }

    public List<Collection> getAll() {
        return repository.findAll();
    }

    public Collection get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format(NOT_FOUND_BY_ID, id)));
    }

    public void delete(Collection collection) {
        repository.delete(collection);
    }
}
