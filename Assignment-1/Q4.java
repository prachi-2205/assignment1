
import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a  Number");
            int num = sc.nextInt();

            System.out.println("Cube of Number:" + num * num * num);
        }
    }
}
