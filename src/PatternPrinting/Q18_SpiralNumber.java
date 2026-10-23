package PatternPrinting;

import java.util.Scanner;

public class Q18_SpiralNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row and column : ");
        int num = sc.nextInt();

        for(int i=1;i<=2*num-1;i++){
            for(int j=1;j<=2*num-1;j++){
                int a=i,b=j;
                if(a>num) a = 2*num-i;
                if(b>num) b = 2*num-j;
                System.out.print(Math.min(a,b)+"  ");

            }

            System.out.println();
        }
    }
}
