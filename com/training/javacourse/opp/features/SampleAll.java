package com.training.javacourse.opp.features;

public abstract  class SampleAll implements Laptop{
    @Override
    public void copy() {
        System.out.println("this is copy method ");
        System.out.println("ctrl+c");
    }

    @Override
    public void paste() {
        System.out.println("this is paste method");
        System.out.println("ctrl+p");
    }
}
