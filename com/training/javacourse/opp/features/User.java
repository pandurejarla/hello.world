package com.training.javacourse.opp.features;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
        lenovo.keyboard();
        System.out.println("");
        Hp hp=new Hp();
        hp.copy();
        hp.paste();
        hp.cut();
        hp.keyboard();
    }
}
