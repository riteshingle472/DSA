package PatternPrinting;

import java.util.Scanner;

public class Q4_AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row and column : ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char ) (64+j) + " ");
            }
            System.out.println();
        }
    }
}
