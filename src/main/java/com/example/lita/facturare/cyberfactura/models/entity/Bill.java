package com.example.lita.facturare.cyberfactura.models.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Bill {

    private String client;

    private String issuer;

    @OneToMany(mappedBy="bill")
    private Set<SoldItem> soldItem;


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Set<SoldItem> getSoldItem() {
        return soldItem;
    }

    public void setSoldItem(Set<SoldItem> soldItem) {
        this.soldItem = soldItem;
    }


}
