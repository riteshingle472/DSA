package Array;

import java.util.Scanner;

public class TotalElementsStricklyGraterThanElementX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();

        int[] arr = io.input();

        System.out.print("Enter the x Number : ");
        int x = sc.nextInt();

        int totalElements = 0;
        for (int item : arr)
            if (item > x) totalElements++;

        io.output(arr);

        System.out.println(totalElements);
    }
}
