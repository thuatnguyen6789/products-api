package com.example.apiproducts.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")

public class Product {
    @Id
    private String id;
    private String name;
    private String slug;
    private String description;
    private String detail;
    private double price;
    private String thumbnail;
    private String info_Manu;
    private String importedAt;
    private String updatedAt;
    private String deletedAt;
    private String createdBy;
    private String updatedBy;
    private String deletedBy;
}
