package com.example.lita.facturare.cyberfactura.models.entity;

import jakarta.persistence.*;

@Entity
public class SoldItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="bill_id", nullable=false)
    private Bill bill;

    private String name;

    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
