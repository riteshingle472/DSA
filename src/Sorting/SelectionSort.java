package Sorting;

import Array.InputAndOutput;

public class SelectionSort {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        io.output(arr);
    }
}
