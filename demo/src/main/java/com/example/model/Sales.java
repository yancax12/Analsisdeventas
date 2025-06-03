package com.example.salesdataanalysis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sales {

    @Id
    private Long id;
    private String product;
    private int quantitySold;
    private double revenue;

    // Constructor vacío (necesario para JPA)
    public Sales() {}

    // Constructor con parámetros
    public Sales(Long id, String product, int quantitySold, double revenue) {
        this.id = id;
        this.product = product;
        this.quantitySold = quantitySold;
        this.revenue = revenue;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
