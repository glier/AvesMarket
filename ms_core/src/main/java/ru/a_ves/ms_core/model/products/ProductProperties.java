package ru.a_ves.ms_core.model.products;

import lombok.Data;
import ru.a_ves.ms_core.model.dictionaries.Characteristic;
import ru.a_ves.ms_core.model.products.characteristics.Value;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class ProductProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @OneToOne
    private Characteristic characteristic;

    @OneToMany
    @JoinTable(name = "product_properties_values",
            joinColumns = @JoinColumn(name = "product_properties_id"),
            inverseJoinColumns = @JoinColumn(name = "value_id")
    )
    @Column(nullable = false)
    private Set<Value> values;
}
