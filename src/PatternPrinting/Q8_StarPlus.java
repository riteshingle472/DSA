package PatternPrinting;

import java.util.Scanner;

public class Q8_StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the number of row : ");
//        int row = sc.nextInt();

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int mid = num / 2 + 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i == mid || j == mid){
                    System.out.print(" * ");
                }else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
