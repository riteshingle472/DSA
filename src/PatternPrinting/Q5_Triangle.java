package PatternPrinting;

import java.util.Scanner;

public class Q5_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Star Triangle :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Alphabet Triangle :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char) (64+i) + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Number Triangle :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Alphanumeric Triangle");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i %2 == 0) {
                    if(j >= 10) System.out.print(" "+(char) (64+j) + "  ");
                    else System.out.print((char) (64+j) + "  ");
                }
                else System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
