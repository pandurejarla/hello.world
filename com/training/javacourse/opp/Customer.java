package com.training.javacourse.opp;

public class Customer {
    int id;
    String name;
    String email;
    int salary;
     int age;



    public   Customer(){
        System.out.println("is called");
    }
    public    Customer(int id,String name,String email,int salary,int age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
        this.age=age;
        System.out.println("this is called");
    }
    public void displayDetails(){
        System.out.println("id is:"+id);
        System.out.println("name is:"+name);
        System.out.println("emai is:"+email);
        System.out.println("salary is:"+salary);
        System.out.println("age is:"+age);
    }
}
