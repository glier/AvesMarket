package ru.a_ves.ms_core.model.products;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StorageFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileUri;
    private String fileType;
}
