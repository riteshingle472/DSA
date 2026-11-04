package Array;

import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();

        int[] arr = io.input();

        for(int i=arr.length-2;i>=0;i--){
            arr[i] = arr[i] + arr[i+1];
        }

        io.output(arr);
    }
}
