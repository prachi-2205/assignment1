import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st number");
        int x = sc.nextInt();
        System.out.println("Enter 2 nd number");

        int y = sc.nextInt();
        System.out.println("Before Swap X & Y is:" + x + " " + y);
        int temp = y;
        y = x;
        x = temp;
        System.out.println("After Swap X & Y is:" + x + " " + y);

    }
}
