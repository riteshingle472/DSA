package Sorting;

import Array.InputAndOutput;

public class BinarySearch {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
//        int[] arr = io.input();
//        int target = 53;
//
//        int low = 0, high = arr.length-1;
//        while(low <= high){
//            int mid = (low + high)/2;
//
//            if(arr[mid] > target) high = mid-1;
//            else if(arr[mid] < target) low = mid+1;
//            else {
//                System.out.println("Target : "+target+" found at index : "+mid);
//                break;
//            }
//        }

        int[][] arr = io.input2dArray();
        System.out.println(searchMatrix(arr, 49));
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        int rows = arr.length, columns = arr[0].length;
        int low = 0, high = rows * columns -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int midRow = mid / columns;
            int midColumn = mid % columns;

            if(arr[midRow][midColumn] == target) return true;
            else if(arr[midRow][midColumn] > target) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}
