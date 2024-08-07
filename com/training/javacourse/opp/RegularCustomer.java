package com.training.javacourse.opp;

public class RegularCustomer extends  Customer{
    int cashbackPoints;

    public RegularCustomer(){
        System.out.println("reg is called");
        System.out.println("cashback points is:"+cashbackPoints);
    }
public RegularCustomer(int id,String name,String email,int salary,int age,int cashbackPoints){
        super(id,name,email,salary,age);
        this.cashbackPoints=cashbackPoints;
}


    @Override
    public  void displayDetails() {
        super.displayDetails();
        System.out.println("cashback points"+cashbackPoints);
    }
}
