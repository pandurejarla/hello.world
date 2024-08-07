package com.training.javacourse.opp;

public class PremiumCustomer extends Customer{
    String membership;
    public PremiumCustomer(){
        System.out.println("pre is called");
    }
    public PremiumCustomer(int id,String name,String email,int salary,int age,String membership){
        super(id, name, email, salary, age);
        this.membership=membership;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("membership is:"+membership);
    }
}
