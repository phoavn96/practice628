package com.hoa.practice628.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int prodID;
    private String prodName;
    private String Description;
    private Date dateOfManf;
    private double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sale> saleSet;

    public void addSale(Sale sale) {
        if (this.saleSet == null) {
            this.saleSet = new HashSet<>();
        }
        this.saleSet.add(sale);
    }
}
