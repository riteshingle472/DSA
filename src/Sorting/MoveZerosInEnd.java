package Sorting;

import Array.InputAndOutput;

public class MoveZerosInEnd {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
        int j = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
