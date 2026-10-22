package PatternPrinting;

import java.util.Scanner;

public class Q4_AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row and column : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Alphabet Square :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char ) (64+j) + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Same Row Alphabet Square :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++)
                System.out.print((char) (64+i) + "  ");
            System.out.println();
        }

        System.out.println();
        System.out.println("One capital One small same Alphabet Row Square :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i %2 == 0) System.out.print((char) (64+i) + "  ");
                else System.out.print((char) (96+i) + "  ");
            }
            System.out.println();
        }
    }
}
