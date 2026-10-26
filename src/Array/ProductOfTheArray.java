package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+i+"th element of array : ");
            arr[i] = sc.nextInt();
        }

        int product = 1;

        for(int item : arr){
            product *= item;
        }
        System.out.println(product);
    }
}
