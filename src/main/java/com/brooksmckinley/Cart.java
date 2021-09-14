/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

public class Cart {

    static double TAX_RATE = 0.055;

    double subtotal = 0.0;

    public Cart() {
    }

    public void add(double price, int quantity) {
        subtotal += price * quantity;
    }

    public String getTotals() {
        double totalTax = subtotal * TAX_RATE;
        return String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, totalTax, subtotal + totalTax);
    }
}