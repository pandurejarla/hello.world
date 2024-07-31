import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        // sum of given number digit
        /*
         * Algorithm for this program
         * 1.get input number from the user and initilize the sum=0
         * 2. Write the condition or logic
         * condition (number!=0)
         * logic is: number%10 and sum+=rem and number/10;
         * 3. Run the code
         */
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number");
        short number = s.nextShort();
        byte sum = 0;

        // write a condition
        while (number != 0) {
            short remender;
            remender = (short) (number % 10);
            sum += remender;
            number /= 10;

        }
        System.out.println("sum of given number digits: " + sum);

    }
}
