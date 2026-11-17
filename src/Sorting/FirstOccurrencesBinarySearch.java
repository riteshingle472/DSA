package Sorting;

import Array.InputAndOutput;

import java.util.Scanner;

public class FirstOccurrencesBinarySearch {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        Scanner sc = new Scanner(System.in);
        int[] arr = io.input();

        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        int low = 0, high = arr.length-1, idx = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] > target) high = mid-1;
            else if(arr[mid] < target) low = mid+1;
            else {
                idx = mid;
                high = mid-1;
            }
        }

        System.out.println("Target "+target+" found on : "+idx+" index");
    }
}
