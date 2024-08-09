package com.training.javacourse.opp.features;

public class Hp extends  SampleAll{
    public void cut() {
        System.out.println("this is cut method");
        System.out.println("in this hp cut is ctrl+alt+x");
    }

    @Override
    public void keyboard() {
        System.out.println("this is keyvoard method in hp");
    }

}
