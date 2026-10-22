package PatternPrinting;

import java.util.Scanner;

public class Q1_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of row : ");
        int row = sc.nextInt();

        System.out.print("Enter a number of column : ");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(" Raju Mirsti "+"  ");
            }
            System.out.println();
        }
    }
}
