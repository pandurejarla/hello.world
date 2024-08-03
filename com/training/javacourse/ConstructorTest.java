package com.training.javacourse;

public class ConstructorTest {
    public static void main(String[] args) {

        System.out.println();
Customer customer1=new Customer(111,"chandu","chandu@gmail.com",1112455, (byte) 19);
customer1.displayCustomerDetails();
Customer customer2=new Customer(121,"pandu","chandu@gmail.com",112423, (byte) 20);
  customer2.displayCustomerDetails();
    }
}
