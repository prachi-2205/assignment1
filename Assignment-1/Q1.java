import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a  first variable");
            int x = sc.nextInt();
            System.out.println("Enter a  Second  variable");
            int y = sc.nextInt();

            System.out.println("Product of the Varibale is:" + x * y);
        }
    }
}