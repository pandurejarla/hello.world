package com.training.javacourse.opp.features;

public class User {
    public static void main(String[] args) {
        Laptop lenovo=new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.cut();
        lenovo.keyboard();
        System.out.println("");
        Laptop hp=new Hp();
        hp.copy();
        hp.paste();
        hp.cut();
        hp.keyboard();
    }
}
