package com.training.javacourse.opp;

public class Main {
    public static void main(String[] args) {
        RegularCustomer red=new RegularCustomer();
        red.displayDetails();
        RegularCustomer red2=new RegularCustomer(1,"pandu","pandu@gemai",12334,19,134);
        red2.displayDetails();
        PremiumCustomer pCustomer=new PremiumCustomer();
        pCustomer.displayDetails();
        PremiumCustomer pCustomer1=new PremiumCustomer(11,"chandu","chandu@gmail.com",134214,19,"gold");
        pCustomer1.displayDetails();
    }
}
