/**
 * Customer
 */
package com.training.javacourse;
public class  Customer {

    int customerId;
    String name;
    String emailId;
    int salary;
    byte age;

    Customer(int customerId,String  name,String emailId,int salary,byte age){
    this.customerId=customerId;
    this.name=name;
    this.emailId=emailId;
    this.salary=salary;
       this.age=age;
    }

    // method types
    /*
     * 1. no return type and no parameters
     */
    void displayCustomerDetails() {

        System.out.println("customer ID is: " + customerId);
        System.err.println("customer name is: " + name);
        System.out.println("customer emain is: " + emailId);
        System.out.println("customer salary is: " + salary);

        System.out.println("custromer age is: " + age);
    }

    // no return type and with parameter
    void customerMembership(String memberShip) {
        System.out.println(name + " membership in this company is:" + memberShip);
    }

    // with return type and no parameters
    byte discountByAge() {
        byte discount = 2;
        if (age >= 50)
            discount = 40;
        else if (age >= 20 && age < 50)
            discount = 20;
        else
            discount = 9;
        return discount;
    }

    // with return type and with parameters
    // based on discount percentage
    double finalPrice(double prize) {
        byte discountPercentage = discountByAge();
        double finalPrize = prize - (prize * discountPercentage) / 100;
        return finalPrize;

    }

}