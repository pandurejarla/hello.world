package com.training.javacourse.opp.collections;

import java.util.LinkedHashSet;

public class LinkedHaseSetReview {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(); //it gives order list items
        linkedHashSet.add(0);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
       // linkedHashSet.add("jdijf"); it gets an error because this is not an integer it is a string.

        for(Integer number:linkedHashSet){
            System.out.println(number);
        }
    }
}
