package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+i+"th element of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[][] input2dArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the ["+i+","+j+"]th element : ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public int[] input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+i+"th element of array : ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public void output(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public void output2dArray(int[][] arr){
        for(int[] array : arr) {
            for(int val : array) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public InputAndOutput() {}
}
