package com.company.domain.store.inventory.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="store_id")
    private Integer storeId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_category")
    private String productCategory;

    @Column(name="product_price")
    private String productPrice;

    @Column(name="product_desc")
    private String productDesc;

}
