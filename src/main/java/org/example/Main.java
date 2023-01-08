package org.example;

import com.backendTest.factory.Factory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        System.out.println("Input your purchases. For example: \"3-9 2-5 1-7 4-23\".");
        Scanner sc1 = new Scanner(System.in);
        String input = sc1.nextLine();

        factory.createCheque(input);

    }
}