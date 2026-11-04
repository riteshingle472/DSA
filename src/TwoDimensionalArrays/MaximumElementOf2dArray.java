package TwoDimensionalArrays;

import Array.InputAndOutput;

public class MaximumElementOf2dArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        int max = Integer.MIN_VALUE;

        for (int[] array : arr) {
            for (int val : array) {
                if (val > max) max = val;
            }
        }

        System.out.println(max);
        io.output2dArray(arr);
    }
}
