package com.backendTest.factory;

import com.backendTest.util.Calculation;

import java.util.ArrayList;
import java.util.Collections;

public class Factory {
    public void createCheque(String input){
        Calculation calculation = new Calculation();

        ArrayList<String> productOrderList = new ArrayList<>();
        Collections.addAll(productOrderList, input.split(" "));

        calculation.createCheque(productOrderList);

    }
}
