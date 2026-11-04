package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();

        System.out.print("Enter the Starting index for reversing the array");
        int st = sc.nextInt();
        System.out.print("Enter the Ending index for reversing the array");
        int end = sc.nextInt();

        int[] arr = io.input();
        int i = st,j = end;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        io.output(arr);
    }
}
