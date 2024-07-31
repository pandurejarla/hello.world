import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        // prime numbers between the range of 100.
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the range");
        byte range = s.nextByte();
        // call isprime method and write for loop code
        for (int j = 2; j <= range; j++) {
            boolean isPrime = isPrime(j);
            if (isPrime) {
                System.out.println(j);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
