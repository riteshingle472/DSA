package TwoDimensionalArrays;

import Array.InputAndOutput;

public class ReverseTheMatrixRowsThenColumn {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        for(int[] array : arr){
            int i = 0, j = array.length-1;

            while(i < j){
                array[i] = array[i] + array[j];
                array[j] = array[i] - array[j];
                array[i] = array[i] - array[j];
                i++;
                j--;
            }
        }

        System.out.println();
        System.out.println("Row Reverse :- ");
        io.output2dArray(arr);

        for(int j=0;j<arr[0].length;j++){
            int x = 0, y = arr.length-1;

            while(x<y){
                int temp = arr[x][j];
                arr[x][j] = arr[y][j];
                arr[y][j] = temp;
                x++;
                y--;
            }
        }

        System.out.println();
        System.out.println("Column Reverse :-");
        io.output2dArray(arr);
    }
}
