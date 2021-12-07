package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Bread bread = new Bread("Mankey", 24.6, 14.6);
        FrenchBread frenchBread = new FrenchBread("Mankey", 24.6, 14.6, 25);
        TandyrConedBread tandyrConedBread = new TandyrConedBread("Mankey", 24.6, 14.6, 25);

        ArmenianBread armenianBread = new ArmenianBread("Mankey", 24.6, 14.6, 25, 2.2);
        Romashca romashca = new Romashca("Mankey", 24.6, 14.6, 25);
        int scan = scanner.nextInt();
        tandyrConedBread.setWeight(scan);
        if (tandyrConedBread.weight <= 0) {
            System.out.println("The bread is fake");
        } else {
            System.out.println(tandyrConedBread);
            tandyrConedBread.varnish();
        }
        frenchBread.makeCuts(7);
        armenianBread.pack();
    }
}
