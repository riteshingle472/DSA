package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        boolean flag = false;
        int index = Integer.MIN_VALUE;
        int idx = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] + arr[j] == target){
                    flag = true;
                    index = i;
                    idx = j;
                    break;
                }
            }
        }

        if(flag) System.out.println("Target ["+target+"] found at "+index+"+"+idx+"th index");
        else System.out.println("Target not found");
    }
}
