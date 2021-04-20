package ru.a_ves.ms_core.model.products.characteristics;

import lombok.Data;
import ru.a_ves.ms_core.model.products.StorageFile;

import javax.persistence.*;

@Data
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToOne
    private StorageFile storageFile;
}
