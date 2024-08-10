package com.training.javacourse.opp.collections;

import java.util.TreeSet;

public class TreeSetReview {
    public static void main(String[] args) {
        TreeSet<Float> treeSet=new TreeSet<Float>(); //it gives sorted list items
        treeSet.add(1.22f);
        treeSet.add(1.33f);
        treeSet.add(1.44f);
        treeSet.add(1.55f);
        treeSet.add(0.33f);
        treeSet.add(0.11f);
        for(Float n:treeSet){
            System.out.println(n);
        }

    }
}
