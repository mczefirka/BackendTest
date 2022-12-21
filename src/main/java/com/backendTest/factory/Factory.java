package com.backendTest.factory;

import com.backendTest.model.Cheque;
import com.backendTest.util.Calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Factory {
    public Cheque createCheque(String input){
        System.out.println("Factory");
        Calculation calculation = new Calculation();

        ArrayList<String> productOrderList = new ArrayList<>();
        Collections.addAll(productOrderList, input.split(" "));

        System.out.println(productOrderList + "Factory\n");

        calculation.calculateCheque(productOrderList);

        Cheque c = new Cheque();
        return c;
    }
}
