package com.dimonick.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    private Long id;
    private Float amount;
    private String image;
    private String name;
    private String[] urls;
}
