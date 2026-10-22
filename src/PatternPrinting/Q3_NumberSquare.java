package PatternPrinting;

import java.util.Scanner;

public class Q3_NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  a number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + j + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
                System.out.print(" " + i + "  ");
            System.out.println();
        }
    }
}
