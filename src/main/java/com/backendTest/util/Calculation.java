package com.backendTest.util;

import com.backendTest.model.Product;

import java.util.ArrayList;

public class Calculation {
    ProductData productData = new ProductData();
    ArrayList<Product> productsList = productData.getProducts();
    ArrayList<Product> chequeProductsList = new ArrayList<>();

    public void createCheque(ArrayList<String> productOrderList) {
        // productOrderList = "3-9 2-5 1-7 4-23"
        // s = "3-9"
        for (String s : productOrderList) {
            int productId;
            int productQuantity;
            String[] idAndQuantity = s.split("-");

            if (idAndQuantity.length == 2) {
                productId = Integer.parseInt(idAndQuantity[0]);
                productQuantity = Integer.parseInt(idAndQuantity[1]);
                // check input
                if (productId >= 1 && productId <= productData.getProducts().size() && productQuantity >= 1) {
                    for (Product p : productsList) {
                        if (p.getId() == productId) {
                            chequeProductsList.add(p);
                            chequeProductsList.get(chequeProductsList.indexOf(p)).setQuantity(productQuantity);
                        }
                    }
                }
            }
        }

        displayCheque(calculateDiscount(chequeProductsList));
    }

    private void displayCheque(ArrayList<Product> chequeProductsList) {
        System.out.println(chequeProductsList);
    }

    public ArrayList<Product> calculateDiscount(ArrayList<Product> chequeProductsList) {
        final double DISCOUNT = 10;

        for (Product p : chequeProductsList) {
            if (p.getOnSale() && p.getQuantity() > 5) {
                p.setPrice(p.getPrice() * (1 - DISCOUNT / 100));
            }
        }

        return chequeProductsList;
    }

}
