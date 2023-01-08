package com.backendTest.factory;

import com.backendTest.util.Calculation;

import java.util.ArrayList;
import java.util.Collections;

public class Factory {
    public void createCheque(String input){
        System.out.println("Factory");
        Calculation calculation = new Calculation();

        ArrayList<String> productOrderList = new ArrayList<>();
        Collections.addAll(productOrderList, input.split(" "));

        System.out.println("Test productOrderList:" + productOrderList + "Factory\n");

        calculation.calculateCheque(productOrderList);

    }
}
