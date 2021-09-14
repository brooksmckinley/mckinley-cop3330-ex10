/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void testCartReport() {
        Cart cart = new Cart();
        cart.add(25.00, 2);
        cart.add(10.00, 1);
        cart.add(4.00, 1);

        String expected = "Subtotal: $64.00\n" +
                "Tax: $3.52\n" +
                "Total: $67.52";
        String actual = cart.getTotals();
        Assertions.assertEquals(expected, actual);
    }
}