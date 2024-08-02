public class Main {
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer();
        customer.displayCustomerDetails(); // this method display null values because methode has pre-defined values.
        customer.name = "pandu";
        customer.customerId = 759;
        customer.emailId = "chandramukesh2022221059@gcrjy.ac.in";
        customer.salary = 124556667;
        customer.age = 19;
        customer.displayCustomerDetails();

        System.out.println();
        Customer customer2;
        customer2 = new Customer();
        customer2.name = "chandu";
        customer2.customerId = 2220759;
        customer2.emailId = "chandra2022221059@gcrjy.ac.in";
        customer2.salary = 124554557;
        customer2.age = 50;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        customer2.displayCustomerDetails();
        System.out.println();
        customer.customerMembership("diamond");
        System.out.println();
        customer2.customerMembership("gold");
        System.out.println();
        System.out.println("discount for " + customer.name + " is :" + customer.discountByAge());
        System.out.println();
        System.out.println("discount for " + customer2.name + " is :" + customer2.discountByAge());
        System.out.println("final prize for " + customer.name + " is :" + customer.finalPrice(20000.00));

        System.out.println("final prize for " + customer2.name + " is:" + customer2.finalPrice(20000));
    }
}
