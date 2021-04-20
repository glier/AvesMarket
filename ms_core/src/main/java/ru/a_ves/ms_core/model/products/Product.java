package ru.a_ves.ms_core.model.products;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import ru.a_ves.ms_core.model.products.characteristics.Brand;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;

    @Lob
    private String descriptionHtml;

    @ManyToOne
    private Brand brand;

    @ManyToMany(mappedBy = "products")
    private Set<Collection> collections;

    @OneToMany
    @JoinTable(name = "product_files",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "storage_file_id")
    )
    private Set<StorageFile> files = new HashSet<>();

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date modifiedDate;

//    TODO Create user entity and auth service
//    @CreatedBy
//    User creator;
//
//    @LastModifiedBy
//    User modifier;

}
