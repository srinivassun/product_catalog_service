package org.example.product_catalog.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseModel {
    private Long id;
    private String name;
    private Date createdAt;
    private String modifiedBy;
}
