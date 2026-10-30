package org.example.product_catalog.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String description;
    private Double price;
    private Status status;
    private Category category;
}
