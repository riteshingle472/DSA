package Sorting;

import Array.InputAndOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSumPair {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target :- ");
        int target = sc.nextInt();

        Arrays.sort(arr);
        io.output(arr);
        System.out.println();

        List<Integer> pair = sumPair(arr, target);
        System.out.println(pair);
    }

    public static List<Integer> sumPair(int[] arr,int target){
        int i = 0 , j = arr.length-1;
        List<Integer> list = new ArrayList<>();

        while(i<j){
            if(arr[i] + arr[j] == target){
                list.add(arr[i]);
                list.add(arr[j]);
                return list;
            }
            else if(arr[i] + arr[j] > target) j--;
            else i++;
        }

        return list;
    }
}
