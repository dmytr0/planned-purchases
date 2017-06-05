package com.dimonick.Entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Float amount = 0.00f;
    private String currency = "₴";
    private String image;
    private String name = "undefined";
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description = "";
    private String category= "default";
    private String urls;
    private Integer priority = 3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "\nid=" + id +
                ",\n amount=" + amount +
                ",\n currency='" + currency + '\'' +
                ",\n image='" + image + '\'' +
                ",\n name='" + name + '\'' +
                ",\n description='" + description + '\'' +
                ",\n category='" + category + '\'' +
                ",\n urls='" + urls + '\'' +
                ",\n priority=" + priority +
                '}';
    }
}
