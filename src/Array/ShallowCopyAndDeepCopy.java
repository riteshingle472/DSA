package Array;

import java.util.Arrays;

public class ShallowCopyAndDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] brr = arr;  //brr is the shallow copy of arr
//
//        brr[0] = 11;
//        System.out.println(arr[0]);
//        System.out.println(brr[0]);

        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 77;
        System.out.println(arr[0]);
        System.out.println(deep[0]);
    }
}
