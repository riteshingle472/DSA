package TwoDimensionalArrays;

import Array.InputAndOutput;

public class MinimumElementFromMaximumElementOfEachRow {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
            if(max < min) min = max;
        }

        System.out.println("The maximum element of array is : "+max+" & minimum element of array : "+min);
    }
}
