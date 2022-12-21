package com.backendTest.model;

import com.backendTest.util.ProductData;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private Boolean onSale;

    public Product(int id, String name, int quantity, double price, Boolean onSale) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.onSale = onSale;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price +
                ", on sale=" + onSale + "]";
    }
}
