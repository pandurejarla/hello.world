import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String brand;
        System.err.println("please enter your brand mobile");
        Scanner s = new Scanner(System.in);
        brand = s.nextLine();
        // Total mobile prize
        int prize = 30000;
        int discount;
        char membership = 'D';
        // switch case without methods
        switch (brand) {
            case "apple":
                if (membership == 'D') {
                    discount = 20;
                } else if (membership == 'G') {
                    discount = 10;
                } else {
                    discount = 4;
                }
                break;
            case "redmi":
                if (membership == 'D') {
                    discount = 25;
                } else if (membership == 'G') {
                    discount = 15;
                } else {
                    discount = 5;
                }
                break;
            default: {
                discount = 2;
                break;
            }

        }
        int getDiscount;
        getDiscount = (prize * discount) / 100;
        System.out.println("Discount you get is: ₹" + getDiscount);
        int finalPrize;
        finalPrize = prize - getDiscount;
        System.err.println("Total prize of this product after discount is: ₹" + finalPrize);
    }
}
