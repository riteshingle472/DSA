package Array;

public class MissingArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
        int n = arr.length + 1;
        int sum = n*(n+1)/2 , arraySum = 0;

        for(int ele : arr)
            arraySum += ele;

        System.out.println(sum - arraySum);
    }
}
