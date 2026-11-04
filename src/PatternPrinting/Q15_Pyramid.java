package PatternPrinting;

import java.util.Scanner;

public class Q15_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        int nsp = num-1, nst = 1;
        System.out.println();
        System.out.println("NSP or NST method :-");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print(" * ");
            }

            nsp--;
            nst += 2;

            System.out.println();
        }
    }
}
