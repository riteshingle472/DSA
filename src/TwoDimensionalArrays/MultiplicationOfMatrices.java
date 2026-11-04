package TwoDimensionalArrays;

import Array.InputAndOutput;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] a = io.input2dArray();
        int[][] b = io.input2dArray();

        int r1 = a.length, r2 = b.length,
                c1 = a[0].length, c2 = b[0].length;

        int[][] arr = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    arr[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        io.output2dArray(arr);
    }
}
