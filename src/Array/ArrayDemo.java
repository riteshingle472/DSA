package Array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {10,20,30,40};
        int[] arr = new int[5];

        Arrays.fill(arr,10);
        int[] copy = Arrays.copyOf(array,arr.length);

        System.out.println(copy.length);
        System.out.println(Arrays.toString(copy));
    }
}
