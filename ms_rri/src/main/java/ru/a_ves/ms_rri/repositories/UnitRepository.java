package ru.a_ves.ms_rri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.a_ves.ms_core.model.dictionaries.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {
}
