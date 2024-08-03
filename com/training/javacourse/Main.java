package com.training.javacourse;
public class Main {
    public static void main(String[] args) {
        Customer customer1;
        customer1 = new Customer(111,"pandu","pandu@gmail.com",124555,(byte) 19);
        customer1.displayCustomerDetails(); // this method display null values because methode has pre-defined values.



        System.out.println();
        Customer customer2;
        customer2 = new Customer(112,"chnadu","chandu@gmail.com",124556,(byte)20);
customer2.displayCustomerDetails();

        customer1.customerMembership("diamond");
        System.out.println();
        customer2.customerMembership("gold");
        System.out.println();
        System.out.println("discount for " + customer1.name + " is :" + customer1.discountByAge());
        System.out.println();
        System.out.println("discount for " + customer2.name + " is :" + customer2.discountByAge());
        System.out.println("final prize for " + customer1.name + " is :" + customer1.finalPrice(20000.00));

        System.out.println("final prize for " + customer2.name + " is:" + customer2.finalPrice(20000));
    }
}
