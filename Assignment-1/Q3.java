import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a  lentgh");
            int length = sc.nextInt();
            System.out.println("Enter a  breadth");
            int breadth = sc.nextInt();

            System.out.println("Area of Recangtale:" + length * breadth);
        }
    }
}
