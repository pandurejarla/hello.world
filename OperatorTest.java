public class OperatorTest {
    public static void main(String[] args) {
        // In this we are trying to learn operator concept
        int num1 = 20;
        int num2 = 10;
        // Arithmetic Operators
        int addition = num1 + num2;
        System.out.println("sum of " + num1 + " and " + num2 + " is: " + addition);
        int subtraction = num1 - num2;
        System.out.println("subtraction of " + num1 + " and " + num2 + " is: " + subtraction);
        int multiplication = num1 * num2;
        System.out.println("multiplication of " + num1 + " and " + num2 + " is: " + multiplication);
        int division = num1 / num2;
        System.out.println("division of " + num1 + " and " + num2 + " is: " + division);
        int modulo = num1 % num2;
        System.out.println("remender of " + num1 + " and " + num2 + " is: " + modulo);

        // Assignment Operators
        int randomNumber = 30;
        System.out.println("random number is: " + randomNumber);
        randomNumber += 10;
        System.out.println("random number is: " + randomNumber);
        randomNumber -= 5;
        System.out.println("random number is: " + randomNumber);
        randomNumber *= 5;
        System.out.println("random number is: " + randomNumber);
        randomNumber /= 5;
        System.out.println("random number is: " + randomNumber);
        randomNumber %= 10;
        System.out.println("random number is: " + randomNumber);

        // Unary operator
        int unary = 22;
        // preIncrement

        System.out.println("pre increment of given number is: " + (++unary));
        // postIncrement
        System.out.println("post increment of given number is: " + (unary++));
        // preDecrement
        System.out.println("pre decrement of given number is: " + (--unary));
        // postIndecrement
        System.out.println("post decrement of given number is: " + (unary--));
        // relationalOperators
        System.out.println(num1 > num2);
        System.out.println();
        System.out.println(num1 < num2);
        System.out.println();
        System.err.println(num1 >= num2);
        System.out.println();
        System.out.println(num1 <= num2);
        System.out.println();
        System.out.println(num1 == num2);
        System.out.println();
        System.out.println(num1 != num2);
        System.out.println();
        System.out.println();

        // LogicalOperators
        System.out.println(num1 > num2 && num1 < num2);
        System.out.println();
        System.out.println(num1 > num2 || num1 < num2);
        System.out.println();
        System.out.println(num1 >= num2 && num1 <= num2);
        System.out.println();
        System.out.println(num1 >= num2 || num1 <= num2);
        System.out.println();
        System.out.println(num1 == num2 && num1 != num2);
        System.out.println();
        System.out.println(num1 == num2 || num1 != num2);
        System.out.println();

    }
}
