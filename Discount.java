public class Discount {
    public static void main(String[] args) {
        int prize = 30000;
        // Discount of diffent members
        int discount;
        char membership = 'D';
        int finalPrize;

        if (membership == 'G') {
            discount = 10;
            finalPrize = prize - (prize * discount) / 100;
            System.out.println("your final prize is:" + finalPrize);
        } else if (membership == 'D') {
            discount = 20;
            finalPrize = prize - (prize * discount) / 100;
            System.out.println("your final prize is:" + finalPrize);

        } else {
            System.out.println("your final prize is:" + prize);
        }
    }
}
