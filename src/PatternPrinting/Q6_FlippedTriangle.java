package PatternPrinting;

import java.util.Scanner;

public class Q6_FlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Horizontally Flipped Star Triangle:-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num + 1 - i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Horizontally Flipped Number Triangle:-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Horizontally Flipped Number Triangle:-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print((num + 1 - j)+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Horizontally Flipped Alphabet Triangle:-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print((char) (64+j) + " ");
            }
            System.out.println();
        }
    }
}
