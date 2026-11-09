package Sorting;

import Array.InputAndOutput;

public class BubbleSort {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

//        Bubble sort optimized
        for(int i=0;i<arr.length-1;i++){
            boolean isSorted = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;

        }

        io.output(arr);
    }
}
