package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the d time of rotation : ");
        int d = sc.nextInt();
        d %= args.length;

        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        swap(0,d-1,arr);
        io.output(arr);

        swap(d, arr.length-1, arr);
        io.output(arr);

        swap(0, arr.length-1, arr);
        io.output(arr);
    }

    public static void swap(int i,int j,int[] arr){
       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
}
