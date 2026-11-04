package TwoDimensionalArrays;

import Array.InputAndOutput;

public class TransposeMatrix {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();
        int[][] matrix = io.input2dArray();

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        io.output2dArray(arr);
        System.out.println();

        int row = matrix.length, col = matrix[0].length;
        int[][] res = new int[col][row];

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j] = matrix[j][i];
            }
        }

        io.output2dArray(res);
    }
}
