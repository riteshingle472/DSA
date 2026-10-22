package PatternPrinting;

import java.util.Scanner;

public class Q9_FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//        System.out.print("Enter the number of column : ");
//        int col = sc.nextInt();

        int a = 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}
