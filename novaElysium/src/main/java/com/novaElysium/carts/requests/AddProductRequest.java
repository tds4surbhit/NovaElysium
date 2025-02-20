package com.novaElysium.carts.requests;

import com.novaElysium.carts.model.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class AddProductRequest {
    private  Long id;
    private  String name;
    private String brand;
    private BigDecimal price;
    private  int inventory;
    private  String description;
    private Category category;
}
