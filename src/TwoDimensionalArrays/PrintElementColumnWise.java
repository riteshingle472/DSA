package TwoDimensionalArrays;

import Array.InputAndOutput;

public class PrintElementColumnWise {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();
        io.output2dArray(arr);

        System.out.println();
        System.out.println();

        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
