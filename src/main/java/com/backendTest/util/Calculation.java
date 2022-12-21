package com.backendTest.util;

import java.util.ArrayList;

public class Calculation {
    public void calculateCheque(ArrayList<String> productOrderList) {
        ProductData productData = new ProductData();
        ArrayList<Integer> chequeProductId = new ArrayList<>();
        ArrayList<Integer> chequeProductQuantity = new ArrayList<>();

        for (String s : productOrderList) {
            char firstChar = s.charAt(0);
            char secondChar = s.charAt(1);
            char thirdChar = s.charAt(2);
            int productId;
            int productQuantity;

            // Check input punctuation
            if (s.length() == 3 && Character.isDigit(firstChar) && secondChar == '-' && Character.isDigit(thirdChar)) {
                // Save prod id and prod quantity size
                int productIdSize = chequeProductId.size();
                int productQuantitySize = chequeProductQuantity.size();

                // Check product id
                productId = Character.getNumericValue(firstChar);
                if (productId >= 1 && productId <= productData.getProducts().size()) {
                    chequeProductId.add(productId);
                }

                // Check product quantity
                productQuantity = Character.getNumericValue(thirdChar);
                if (productQuantity >= 1) {
                    chequeProductQuantity.add(productQuantity);
                }

                // Check for 5 products on sale and check if prod id and prod quantity changed
//                if (productData.getProductsOnSale().contains(productId)
//                        && productIdSize < chequeProductId.size() && productQuantitySize < chequeProductQuantity.size()) {
//                    if (productQuantity > 5){
//
//                    }
//                }


            }
        }


    }


}
