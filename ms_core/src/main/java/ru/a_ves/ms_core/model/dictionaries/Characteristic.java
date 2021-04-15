package ru.a_ves.ms_core.model.dictionaries;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
}
