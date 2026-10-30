package Array;

import java.util.Scanner;

public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();

        int[] arr = io.input();
        int totalSum = 0;

        for(int val : arr) totalSum += val;
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
            int suffix = totalSum - arr[i];

            if(arr[i] == suffix){
                System.out.print("From : "+0+" to : "+i+" And From : "+(i+1)+" to : "+(arr.length-1));
                break;
            }
        }
    }
}
