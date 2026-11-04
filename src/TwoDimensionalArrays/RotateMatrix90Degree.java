package TwoDimensionalArrays;

import Array.InputAndOutput;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println();
        io.output2dArray(arr);
        System.out.println();


//        Clock wise
//        Reverse Each element of row
        for(int[] a : arr){
            int i = 0, j = a.length-1;

            while(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

//        Anti-clock wise
//        Swap Row

//        int i = 0, j = arr.length-1;
//        while(i < j){
//            int[] temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }

        io.output2dArray(arr);
    }
}
