package TwoDimensionalArrays;

import Array.InputAndOutput;

public class MaximumSumOfRow {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        int sum = 0, max = 0, idx = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
                idx = i;
            }
        }

        System.out.println("The Maximum sum of array is : "+max+" on row : "+idx);
    }
}
