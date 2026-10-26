package Array;

import java.util.Scanner;

public class MaximumElementOfTheArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        int max = Integer.MIN_VALUE;
        for(int i=1;i< arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(max);
        io.output(arr);
    }
}
