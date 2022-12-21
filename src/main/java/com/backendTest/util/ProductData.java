package com.backendTest.util;

import com.backendTest.model.Product;

import java.util.ArrayList;

public class ProductData {
    public ArrayList<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Shoes", 1, 115, false));
        products.add(new Product(2, "Vinyl record", 1, 25, false));
        products.add(new Product(3, "Porsche Taycan", 1, 83477, false));
        products.add(new Product(4, "Christmas tree", 1, 44, true));

        return products;
    }

    public ArrayList<Product> getProductsOnSale(){
        ArrayList<Product> productsOnSale = new ArrayList<>();

        for (Product p : getProducts()){
            if (p.getOnSale()){
                productsOnSale.add(p);
            }
        }

        return productsOnSale;
    }



}
