package ru.a_ves.ms_rri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.a_ves.ms_core.model.products.characteristics.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
}
