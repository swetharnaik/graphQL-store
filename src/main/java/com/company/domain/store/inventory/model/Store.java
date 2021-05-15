package com.company.domain.store.inventory.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Store {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="store_name")
    private String storeName;

    @Column(name="store_code")
    private Integer storeCode;

    @Column(name="store_type")
    private String storeType;

    private String pincode;

    private String address;

    @Column(name="phone_no")
    private Integer phoneNo;
}
