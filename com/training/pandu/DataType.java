public class DataType {
    public static void main(String[] args) {
        System.err.println("hello world");
        // byte data type
        byte age = 19;
        // short data type
        short interMarks = 895;
        // int data type
        int money = 500000;
        // long data type
        long asset = 800000009999l;
        System.out.println("my age is: " + age);
        System.out.println("my inter marks is: " + interMarks);
        System.out.println("money in this code is: " + money);
        System.out.println("assets in this code is: " + asset);
        // float data type
        float avgSalary = 20000.28f;
        System.out.println("average salary is: " + avgSalary);
        // double data type
        double averageAnnualRevenue = 23456676777.34556;
        System.out.println("average annual salary is: " + averageAnnualRevenue);

        char gender = 'M';
        System.out.println("my gender is: " + gender);

        boolean isEligible = true;
        System.out.println("eligible : " + isEligible);

        /*
         * type conversion in java
         * implicit type conversion
         */
        byte myAge;
        myAge = 19;
        int age1 = myAge;
        // This is waste our data
        System.out.println("my age is: " + age1);
        float sellingPrize = 1299.99f;
        // Explicite type conversion
        int roundUp = (int) sellingPrize;
        // In this type conversion our data may be loss
        System.err.println("round up money is: " + roundUp);

    }
}
