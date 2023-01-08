package com.backendTest.model;

public class Product {
    private final int id;
    private final String name;
    private int quantity;
    private double price;
    private final Boolean onSale;

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price +
                ", on sale=" + onSale + "]";
    }
}
