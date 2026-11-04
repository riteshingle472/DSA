package TwoDimensionalArrays;

import Array.InputAndOutput;

import java.util.Scanner;

public class SearchTargetIn2dArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[][] arr = io.input2dArray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        int i = 0, j = arr.length-1;
        boolean found = false;
        while(i < arr.length && j >= 0){
            if(arr[i][j] == target) {
                found = true;
                break;
            }
            else if(arr[i][j] > target) j--;
            else i++;
        }

        if(found) System.out.println("Found");
        else System.out.println("Not found");
    }
}
