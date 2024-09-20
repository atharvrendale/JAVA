import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First division
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result of first division: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by zero");
        }

        // Array input
        int[] arr = new int[6];
        int[] ans = new int[6];
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        // Division of array elements
        System.out.println("Enter number to divide:");
        int d = sc.nextInt();
        try {
            for (int i = 0; i < 6; i++) {
                ans[i] = arr[i] / d;
            }
            System.out.println("Answers are:");
            for (int i = 0; i < 6; i++) {
                System.out.println(" " + ans[i]);
            }
        } catch (ArithmeticException z) {
            System.out.println("Error: Divide by zero");
        }

        sc.close();
    }
}
