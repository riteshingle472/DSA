package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Target number : ");
        int search = sc.nextInt();

        boolean flag = false;
        int index = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if (arr[i] == search) {
                flag = true;
                index = i;
                break;
            }
        }

        if(flag) System.out.println("Target ["+search+"] found at "+index+"th index");
        else System.out.println("Target not found");
    }
}
