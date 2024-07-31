import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // check wheater prime or not below 127
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number value:");
        byte number = s.nextByte();
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    // isprime method
    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
