public class Loops {
    public static void main(String[] args) {
        // In this code we are trying to print even numbers between given range.
        // using For loop and while loop and do-while loop
        byte startingNumber = 1;
        byte endingNumber = 100;
        // using for loop
        System.out.println("Using for loop");
        System.out.println("EVEN NUMBERS BETWEEN THE RANGE IS:");
        for (startingNumber = 1; startingNumber <= endingNumber; startingNumber++) {
            // logic for even numbers

            if (startingNumber % 2 == 0)
                System.out.println(startingNumber);
        }
        System.err.println();
        System.err.println();
        // using while loop
        byte start = 1;
        byte end = 120;
        System.err.println("using while loop");
        System.out.println("EVEN NUMBERS BETWEEN THE RANGE IS:");
        while (start <= end) {

            if (start % 2 == 0) {
                System.out.println(start);

            }
            start++;

        }
        System.err.println();
        System.err.println();
        // using do-while loop
        short fistPosition = 100;
        short endPostion = 32700;
        System.err.println("using do-while loop");
        System.out.println("EVEN NUMBERS BETWEEN THE RANGE IS:");
        do {

            if (fistPosition % 2 == 0) {
                System.out.println(fistPosition);

            }
            fistPosition += 1;
        } while (fistPosition <= endPostion);
    }
}
