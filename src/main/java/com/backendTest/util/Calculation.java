package com.backendTest.util;

import com.backendTest.model.Product;

import java.util.ArrayList;

public class Calculation {
    ProductData productData = new ProductData();
    ArrayList<Boolean> discountList = new ArrayList<>();

    public void calculateCheque(ArrayList<String> productOrderList) {
        ArrayList<Integer> chequeProductId = new ArrayList<>();
        ArrayList<Integer> chequeProductQuantity = new ArrayList<>();
        int productIdSize;
        int productQuantitySize;

        // productOrderList = "3-9 2-5 1-7 4-23"
        // s = "3-9"
        for (String s : productOrderList) {
            int productId;
            int productQuantity;

            System.out.println("\nTest two-digit:");
            String[] testStrArr = s.split("-");

            if (testStrArr.length == 2) {
                productId = Integer.parseInt(testStrArr[0]);
                productQuantity = Integer.parseInt(testStrArr[1]);

                // Check product id
                if (productId >= 1 && productId <= productData.getProducts().size()) {
                    chequeProductId.add(productId);
                    System.out.println("productId:" + productId);
                }

                // Check product quantity
                if (productQuantity >= 1) {
                    chequeProductQuantity.add(productQuantity);
                    System.out.println("productQuantity:" + productQuantity);
                }
            }
            System.out.println("Test two-digit\n");
        }

        // Save prod id and prod quantity size
        productIdSize = chequeProductId.size();
        productQuantitySize = chequeProductQuantity.size();

        if (productIdSize == productQuantitySize) {
            calcDiscount(chequeProductId, chequeProductQuantity);
            System.out.println("Test chequeProductId:" + chequeProductId + " Calculation");
            System.out.println("Test chequeProductQuantity:" + chequeProductQuantity + " Calculation");
            System.out.println("Test discountList:" + discountList + " Calculation");
        }


    }

    private void calcDiscount(ArrayList<Integer> chequeProductId, ArrayList<Integer> chequeProductQuantity) {
        for (int i = 0; i < chequeProductId.size(); i++) {
            for (Product p : productData.getProductsOnSale()) {
                if (p.getId() == i + 1 && p.getOnSale() && chequeProductQuantity.get(i) > 5) {
                    discountList.add(true);
                } else {
                    discountList.add(false);
                }
            }
        }
    }


}
