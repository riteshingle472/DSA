package TwoDimensionalArrays;

import Array.InputAndOutput;

public class PrintMatrixColumnWiseInSnakePattern {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        for(int j=0;j<arr[0].length;j++){
            if(j %2 == 0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
