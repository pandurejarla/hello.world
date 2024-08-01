public class Main {
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer();
        customer.name = "pandu";
        customer.customerId = 759;
        customer.emailId = "chandramukesh2022221059@gcrjy.ac.in";
        customer.salary = 124556667;
        System.err.println(customer.name);
        System.out.println(customer.customerId);
        System.out.println(customer.salary);
        System.out.println(customer.emailId);
        System.out.println();
        Customer customer2;
        customer2 = new Customer();
        customer.name = "chandu";
        customer.customerId = 2220759;
        customer.emailId = "chandra2022221059@gcrjy.ac.in";
        customer.salary = 124554557;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.err.println(customer.name);
        System.out.println(customer.customerId);
        System.out.println(customer.salary);
        System.out.println(customer.emailId);
    }
}
