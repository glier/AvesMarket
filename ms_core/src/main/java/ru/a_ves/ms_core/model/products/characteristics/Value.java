package ru.a_ves.ms_core.model.products.characteristics;

import lombok.Data;
import ru.a_ves.ms_core.model.dictionaries.Unit;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Value implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @ManyToOne
    Unit unit;
}
