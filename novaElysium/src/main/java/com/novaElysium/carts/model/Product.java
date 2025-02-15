package com.novaElysium.carts.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    private String brand;
    private BigDecimal price;
    private  int inventory;
    private  String description;

//    RelationShip
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    //Once the product is deleted , all its images will be deleted as well .
    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Image> Images;
}
