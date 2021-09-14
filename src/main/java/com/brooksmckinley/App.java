/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cart cart = new Cart();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            double price = scan.nextDouble();
            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            int quantity = scan.nextInt();
            cart.add(price, quantity);
        }

        System.out.println(cart.getTotals());
    }
}