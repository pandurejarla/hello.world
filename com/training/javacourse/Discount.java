package com.training.javacourse;
public class Discount {
    public static void main(String[] args) {
        int prize = 30000;
        // Discount of diffent members
        int discount;
        char membership = 'D';
        int finalPrize;
        int getDiscount;

        if (membership == 'G') {
            discount = 10;

        } else if (membership == 'D') {
            discount = 20;

        } else {
            discount = 2;
        }

        getDiscount = (prize * discount) / 100;
        System.out.println("you got $" + getDiscount + " of discount of this product");
        finalPrize = prize - (prize * discount) / 100;
        System.out.println("your final prize is: $" + finalPrize);
    }
}
