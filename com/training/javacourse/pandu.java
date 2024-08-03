import java.util.Scanner;

public class pandu {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a value:");
    int n = scan.nextInt();
    scan.nextLine();
    System.out.println("please enter a string:");
    String s = scan.nextLine();
    System.out.println("please enter a value:");
    int n1 = scan.nextInt();
    scan.nextLine();
    System.out.println("please enter a string:");
    String s1 = scan.nextLine();
    System.out.println("please enter a value:");
    int n2 = scan.nextInt();
    scan.nextLine();
    System.out.println("please enter a string:");
    String s2 = scan.nextLine();
    System.out.println("================================");
    System.out.printf("%s 15%d\n", s, n);
    System.out.printf("%s %15d\n", s1, n1);
    System.out.printf("%s %15d\n", s2, n2);
    System.out.println("================================");
  }
}