package PatternPrinting;

import java.util.Scanner;

public class Q11_OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();


        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}
