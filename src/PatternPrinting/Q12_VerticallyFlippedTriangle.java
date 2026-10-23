package PatternPrinting;

import java.util.Scanner;

public class Q12_VerticallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Vertically Flipped Triangle Method 1 :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((i+j) > num) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Vertically Flipped Triangle Method 2 :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("   ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Vertically Flipped Number Triangle:-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("   ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(k+"  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Vertically Flipped Alphabet Triangle Method 2 :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char) (64+i)+"  ");
            }

            System.out.println();
        }
    }
}
