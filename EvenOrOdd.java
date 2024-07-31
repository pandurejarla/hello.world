import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
         * Algorithm for this program
         * 1.logic: if number %2==0 even other wise odd
         * 2.input range 1-120;
         * 3. sutable data type
         * 4. write the code using above algorithm
         * 5. run the code
         */
        byte number;
        System.out.println("please enter a number less than 120 :");
        Scanner s = new Scanner(System.in);
        number = s.nextByte();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
