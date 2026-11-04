package TwoDimensionalArrays;

import Array.InputAndOutput;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        System.out.println("Enter the First Array :-");
        int[][] a = io.input2dArray();

        System.out.println("Enter the Second Array :-");
        int[][] b = io.input2dArray();

        int[][] res = add(a, b);

        io.output2dArray(res);

    }

    public static int[][] add(int[][] a,int[][] b){
        int[][] res = new int[a.length][];

        for(int i=0;i<a.length;i++){
            res[i] = new int[a[i].length];
            for(int j=0;j<a[i].length;j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
}
