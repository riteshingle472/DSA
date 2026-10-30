package Array;

import java.util.Scanner;

public class RangSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        System.out.print("Enter the Q queries : ");
        int q = sc.nextInt();

        PrefixSum.prefix(arr);

        while(q-- > 0){
            System.out.print("Enter the rang : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(arr[r] - arr[l-1]);
        }
    }
}
