package PatternPrinting;

import java.util.Scanner;

public class Q16_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int nsp=num-1 , nst=1;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print(" * ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

        nsp = 1;
        nst = 2*num-3;

        for(int i=1;i<=num-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print(" * ");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }
}
